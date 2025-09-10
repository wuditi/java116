package com.wn.serviceAdvice;

import com.wn.service.UserService;

/**
 * 静态代理增强
 */
public class UserServiceImplAdvice implements UserService {

    private UserService userService;


    public UserServiceImplAdvice(UserService userService) {
        this.userService = userService;
    }


    @Override
    public boolean login(String username, String password) {

        select(username, password);

        userService.login(username, password);

        return false;
    }


    public void select(String username, String password) {

        System.out.println("判断");

    }
}
