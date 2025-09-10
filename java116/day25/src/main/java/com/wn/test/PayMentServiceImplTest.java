package com.wn.test;

import com.wn.controller.PayMentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class PayMentServiceImplTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PayMentController paymentController = (PayMentController) context.getBean("payMentController");
        paymentController.getService();

    }


}
