package com.wn.service.impl;

import com.wn.annotation.AdviceLog;
import com.wn.annotation.SetAnnotaation;
import com.wn.service.UserService;
import org.springframework.stereotype.Service;

/**
 * version1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @AdviceLog
    @Override
    public boolean login(String username, String password) {
        System.out.println("实现登录");
        return false;
    }

}
