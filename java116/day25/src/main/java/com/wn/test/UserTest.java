package com.wn.test;

import com.wn.entity.UseName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UseName useName = (UseName) applicationContext.getBean("user");
//        System.out.println(useName);
//        UseName useName2 = (UseName) applicationContext.getBean("user2");
//        System.out.println(useName2);
//        UseName useName = (UseName) applicationContext.getBean("beanUser");
//        System.out.println(useName);
        //UseName useName = (UseName) applicationContext.getBean("userBean");
        UseName useName = (UseName) applicationContext.getBean("user");
        System.out.println(useName);


    }
}
