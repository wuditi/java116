package com.wn.controller;

import com.wn.service.impl.AliPayMentServiceImpl;
import com.wn.service.PayMentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class PayMentController {

    @Resource(type = AliPayMentServiceImpl.class)
    private PayMentService payMentService;


    public void getService() {
        payMentService.PayMent();
    }
}


