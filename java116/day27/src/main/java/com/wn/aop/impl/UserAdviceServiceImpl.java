package com.wn.aop.impl;

import com.wn.annotation.AdviceLog;
import com.wn.aop.UserAdviceService;
import org.springframework.stereotype.Service;


@Service
public class UserAdviceServiceImpl implements UserAdviceService {

    @Override
    public String login(String username, String password) {

        if (username.equals("123")) throw new RuntimeException();
        if (username.equals("admin") && password.equals("123456")) {

            System.out.println("成功------");
            return "成功";
        }

        return "失败";
    }

    @AdviceLog
    @Override
    public String register() {
        System.out.println("注册");
        return "aa";
    }

    @AdviceLog
    @Override
    public String update() {
        System.out.println("修改");
        return "bb";
    }
}
