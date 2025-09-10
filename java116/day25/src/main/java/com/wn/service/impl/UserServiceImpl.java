package com.wn.service.impl;

import com.wn.mapper.UserMapper;
import com.wn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void addImforation(String name) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = (UserMapper) context.getBean("addImforation");
//        userMapper.create();
//        System.out.println(userMapper.add());
        userMapper.add(name);

    }
}