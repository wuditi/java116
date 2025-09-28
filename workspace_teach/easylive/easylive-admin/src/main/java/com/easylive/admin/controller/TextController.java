package com.easylive.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @RequestMapping("/test")
    public String test() {

        return " admin  hello world";
    }
}
