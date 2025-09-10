package com.wn.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wn.boot.entity.User;
import com.wn.boot.mappper.UserMapper;
import com.wn.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginBynameAndPwd(String username, String password) {

        String encrypPwd = DigestUtils.md5DigestAsHex(password.getBytes());

        User u = userMapper.selectByUidAndUname(username, encrypPwd);


        return u;
    }

    @Override
    public Map<String, Object> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        Map<String, Object> map = new HashMap<>();
        map.put("pageTotal", pageInfo.getTotal());
        map.put("pageNum", pageInfo.getPageNum());
        map.put("pageSize", pageInfo.getPageSize());
        map.put("pageData", pageInfo.getList());

        return map;
    }


}
