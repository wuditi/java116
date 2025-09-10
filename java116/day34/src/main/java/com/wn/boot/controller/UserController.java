package com.wn.boot.controller;


import com.wn.boot.entity.User;
import com.wn.boot.entity.UserVo;
import com.wn.boot.service.UserService;
import com.wn.boot.utils.JWTUtil;
import com.wn.boot.utils.ResultObj;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("use")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public ResultObj login(String username, String password, HttpServletResponse response) {

        User userinfo = userService.loginBynameAndPwd(username, password);
        if (userinfo != null) {
            String token = JWTUtil.generateToken(userinfo);

            System.out.println(token);

            response.setHeader("tokenHeader", token);
            response.setHeader("Access-Control-Expose-Headers", "token");

            UserVo userVo = new UserVo();

            BeanUtils.copyProperties(userinfo, userVo);

            return ResultObj.Ok(userVo);
        }
        return ResultObj.failed();
    }

    @RequestMapping("/queryAll")
    public ResultObj queryAll(Integer pageNum, Integer pageSize) {
        Map<String, Object> map = userService.findAll(pageNum, pageSize);
        return ResultObj.Ok(map);
    }

}
