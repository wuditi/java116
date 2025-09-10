package com.wn.mapper;

import com.wn.entity.Dog;
import com.wn.entity.UseName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

    //
//    public void create() {
//
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        applicationContext.getBean("userCreateMapper");
//
//    }
    @Autowired
    private Dog dog;


    public void add(String name) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UseName useName = (UseName) applicationContext.getBean("userAddMapper");
//
//        return useName;

        System.out.println("新建内容" + name);
        dog.setName(name);
        System.out.println(dog);

    }
}
