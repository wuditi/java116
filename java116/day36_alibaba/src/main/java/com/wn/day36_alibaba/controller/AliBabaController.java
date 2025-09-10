package com.wn.day36_alibaba.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("ali")
public class AliBabaController {

    private ChatClient chatClient;

    /**
     * 通过构造方法给  chatClient 属性值
     *
     * @param builder
     */
    public AliBabaController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    /**
     * 聊天默认
     *
     * @param input
     * @return
     */
    @GetMapping("/chat")
    public String chat(String input) {
        return this.chatClient.prompt("日文中文双语回复") //设置提示词
                .user(input) //用户向大模型发送的内容
                .call() //表示发送请求
                .content(); // 获取响应内容
    }

    /**
     * 流式响应
     *
     * @param input
     * @return
     */
    @GetMapping(value = "/stream")
    public Flux<String> stream(String input) {
        return this.chatClient.prompt("常规响应") //设置提示词
                .user(input) //用户向大模型发送的内容
                .stream()//表示发送请求
                .content();// 获取响应内容
    }

}
