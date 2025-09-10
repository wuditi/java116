package com.wn.controller;

import com.wn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserServiceImplController {
    @Autowired
    private UserService userService;


}
