package com.wn.day32.controller;

import com.wn.day32.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RequestMapping("/param")
@RestController
public class ParamController {


    @RequestMapping("/param01")
    public Map<String, String[]> param01(HttpServletRequest request) {

        Map<String, String[]> map = request.getParameterMap();

        return map;

    }


    @RequestMapping("/param02")
    public Map<String, Object> param02(String uname, String psw) {

        Map<String, Object> map = new HashMap<>();

        map.put("uname", uname);
        map.put("psw", psw);
        return map;
    }


    @RequestMapping("/param03")
    public Map<String, Object> param03(@RequestParam("usename") String uname, String psw) {

        Map<String, Object> map = new HashMap<>();

        map.put("uname", uname);
        map.put("psw", psw);
        return map;
    }


    @RequestMapping("/param04")
    public Map<String, Object> param04(@RequestParam(value = "usename") String uname,
                                       @RequestParam(value = "ps", defaultValue = "22") String psw) {

        Map<String, Object> map = new HashMap<>();

        map.put("uname", uname);
        map.put("psw", psw);
        return map;
    }


    @RequestMapping("/param05")
    public User param05(User user) {

        return user;
    }


    @RequestMapping("param06")
    public User param06(@RequestBody User user) {
        return user;
    }


    @RequestMapping("Data01")

    public Map<String, Object> paramData01(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date birthday) {
        Map<String, Object> map = new HashMap<>();
        map.put("birthday", birthday);


        return map;
    }


    @RequestMapping("Data02")

    public User paramData01(User user) {

        return user;
    }


}
