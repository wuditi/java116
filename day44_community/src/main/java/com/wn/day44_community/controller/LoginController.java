package com.wn.day44_community.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.util.IdUtil;
import com.wf.captcha.ArithmeticCaptcha;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.entity.vo.UserInfoVo;
import com.wn.day44_community.service.UserInfoService;
import com.wn.day44_community.utils.JWTUtil;
import com.wn.day44_community.utils.RedisUtil;
import com.wn.day44_community.utils.ResultObj;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
    @Autowired
    private RedisUtil redis;
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("getCheckCode")
    public ResultObj getCheckCode(String codeId) {

        //定义Map集合封装返回数据
        Map<String, Object> map = new HashMap<>();
        //判断codeId是否为null  或者 空串
        if (codeId == null || codeId.trim().isEmpty()) {
            //表示用户第一次获取验证，所以，随机生成一个唯一标识符
            codeId = IdUtil.getSnowflakeNextIdStr();
        }


        //算数验证码
        ArithmeticCaptcha captcha = new ArithmeticCaptcha(120, 30);
        String code = captcha.text();

        //设置验证码图片长、宽、验证码字符数、干扰线宽度
//        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(120, 30, 1, 100);
//        //设置字体样式和大小
//        lineCaptcha.setFont(new Font("仿宋", Font.BOLD, 30));
//        //获取验证码
//        String code = lineCaptcha.getCode();
        System.out.println(code);
        redis.set(codeId, code, 60);
        //转为Base64字符串
        String imageBase64 = captcha.toBase64();
       // String imageBase64 = lineCaptcha.getImageBase64Data();

        map.put("codeId", codeId);
        map.put("imageBase64", imageBase64);

        return ResultObj.Ok(map);
    }

    @PostMapping
    public ResultObj login(@RequestBody UserInfoVo userInfoVo, HttpServletResponse response) {
        //验证码是否过期，在redis
        String code = redis.get(userInfoVo.getCodeId());
        if (code == null || code.trim().isEmpty()) {
            return ResultObj.failed().code(520).msg("验证码已过期");
        }
        if (code.equalsIgnoreCase(userInfoVo.getVerifyCode())) {

            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(userInfoVo, userInfo);
            UserInfo use = userInfoService.login(userInfo);

            if (use != null) {

                //生成token
                String token = JWTUtil.generateToken(use);
                //添加token到请求头
                response.setHeader("token", token);
                response.setHeader("Access-Control-Expose-Headers", "token");

                Map<String, Object> map = new HashMap<>();
                map.put("username", use.getUsername());
                map.put("imgPath", use.getImgPath());
                return ResultObj.Ok(map);
            }


            return ResultObj.failed().code(521).msg("账号或密码错误");
        }

        return ResultObj.failed().code(522).msg("验证码错误");
    }
}
