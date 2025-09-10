package com.wn.test;

import com.wn.aop.UserAdviceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceLoginTest {


    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContent.xml");
        UserAdviceService userService = (UserAdviceService) ac.getBean("userAdviceServiceImpl");
        userService.login("admin", "123456");
        userService.register();
        userService.update();
    }


}
