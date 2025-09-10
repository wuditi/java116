package com.wn.day35.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wn.day35.entity.User;
import com.wn.day35.mapper.UserMapper;
import com.wn.day35.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
