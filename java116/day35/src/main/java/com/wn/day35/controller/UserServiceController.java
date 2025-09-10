package com.wn.day35.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wn.day35.entity.User;
import com.wn.day35.service.UserService;
import com.wn.day35.util.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserServiceController {
    @Autowired
    private UserService userService;

    @RequestMapping("find")
    public ResultObj findUserById(Integer uid) {

        User user = userService.getById(uid);
        return ResultObj.Ok(user);
    }

    @RequestMapping("saveUser")
    public ResultObj saveUser(User user) {

        userService.saveOrUpdate(user);

        return ResultObj.Ok();
    }


}
