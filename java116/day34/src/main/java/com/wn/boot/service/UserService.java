package com.wn.boot.service;

import com.wn.boot.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {


    User loginBynameAndPwd(String username, String password);

    Map<String, Object> findAll(Integer pageNum, Integer pageSize);

}
