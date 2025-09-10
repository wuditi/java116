package com.wn.controller;

import com.wn.mapper.UserMapper;
import com.wn.service.UserService;
import com.wn.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller("aaa")
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void handleRequest(String name) {
        System.out.println("Controller 层：收到请求");
        userService.addImforation(name);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController) context.getBean("aaa");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        String name = "狗1";
        userController.handleRequest(name);
//        System.out.println(userController);
//        System.out.println(userService);
//        System.out.println(userMapper);

    }

}
