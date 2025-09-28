package com.easylive.web.controller;

import java.util.List;

import com.easylive.entity.query.UserInfoQuery;
import com.easylive.entity.po.UserInfo;
import com.easylive.entity.vo.ResponseVO;
import com.easylive.service.UserInfoService;
import com.wf.captcha.ArithmeticCaptcha;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 用户信息 Controller
 */
@RestController
@RequestMapping("/account")
public class AccountController extends ABaseController{

	@Resource
	private UserInfoService userInfoService;
	@RequestMapping("/checkCode")
     public ResponseVO checkCode(HttpSession session) {

		 ArithmeticCaptcha captcha = new ArithmeticCaptcha(100, 42);
		 String code =captcha.text();
         session.setAttribute("captcha", code);
         String checkCodeBase64 = captcha.toBase64();
		 return getSuccessResponseVO(checkCodeBase64);
     }
}