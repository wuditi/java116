package com.wn.service.impl;

import com.wn.mapper.UserMapper;
import com.wn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Transactional
    @Override
    public void save(double fromPrice, double toPrice, double amount) {

        userMapper.UpdateUser(amount, fromPrice);

        userMapper.UpdateUser(amount, toPrice);

    }
}
