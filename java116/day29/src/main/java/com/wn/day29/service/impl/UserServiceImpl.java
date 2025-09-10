package com.wn.day29.service.impl;

import com.wn.day29.entity.Userinfo;
import com.wn.day29.mapper.UserinfoMapper;
import com.wn.day29.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Transactional
    @Override
    public void AddUser(Userinfo userinfo, Integer id, Integer uid, Integer rid) {
        userinfoMapper.insertUserinfo(userinfo);
        userinfoMapper.insertUserRole(id, uid, rid);

    }
}
