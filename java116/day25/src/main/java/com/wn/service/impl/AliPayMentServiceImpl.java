package com.wn.service.impl;

import com.wn.service.PayMentService;
import org.springframework.stereotype.Service;

@Service
public class AliPayMentServiceImpl implements PayMentService {

    @Override
    public void PayMent() {
        System.out.println("ali");
    }
}
