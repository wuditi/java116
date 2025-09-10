package com.wn.service.impl;

import com.wn.service.PayMentService;
import org.springframework.stereotype.Service;

@Service
public class WechatPayMentServiceImpl implements PayMentService {

    @Override
    public void PayMent() {
        System.out.println("weixin");
    }
}
