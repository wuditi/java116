package com.wn.day37.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
public class AlibabaController {

    private ChatClient chatClient;

    /**
     * 通过构造方法给  chatClient 属性值
     *
     * @param builder
     */
    public AlibabaController(ChatClient.Builder builder) {
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


}
