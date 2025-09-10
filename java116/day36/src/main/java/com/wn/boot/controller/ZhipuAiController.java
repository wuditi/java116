package com.wn.boot.controller;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.zhipuai.ZhiPuAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
@RequestMapping("zp")
public class ZhipuAiController {

    @Autowired
    private ZhiPuAiChatModel chatModel;

    /**
     * 实现1对1问答
     *
     * @param message
     * @return
     */
    @GetMapping("/ai/generate")
    public Map generate(@RequestParam(value = "message", defaultValue = "你好") String message) {
        return Map.of("generation", this.chatModel.call(message));
    }

    @GetMapping(value = "/ai/generateStream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> generateStream(@RequestParam(value = "message", defaultValue = "请用简单介绍一下成都的历史") String message) {
        var prompt = new Prompt(new UserMessage(message));
//        Flux<ChatResponse> stream = chatModel.stream(prompt);
        return chatModel.stream(prompt).flatMapSequential(res -> {
            String text = res.getResult().getOutput().getText();
            if (text == null) {
                text = "";
            }
            return Flux.just(text);
        });
    }
}
