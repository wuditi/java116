package com.wn.day33.service.impl;

import com.wn.day33.mapper.UserMapper;
import com.wn.day33.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addImg(String url, String uname) {
        userMapper.updateUser(url, uname);
    }
}
