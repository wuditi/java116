package com.wn.test;

import com.wn.service.UserService;
import com.wn.service.impl.UserServiceImpl;
import com.wn.serviceAdvice.UserServiceImplAdvice;

public class LoginTest {

    // static UserServiceImpl_select userService = new UserServiceImpl_select();

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        UserServiceImplAdvice userServiceAdvice = new UserServiceImplAdvice(userService);
        String name = "111";
        String password = "123456";
        userService.login(name, password);
    }

}
