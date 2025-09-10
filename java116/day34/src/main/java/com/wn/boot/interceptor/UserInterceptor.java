package com.wn.boot.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wn.boot.utils.JWTUtil;
import com.wn.boot.utils.ResultObj;
import com.wn.boot.utils.TokenEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.aopalliance.intercept.Interceptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        //请求头中获取token
        String token = request.getHeader("token");
        //转换json
        ObjectMapper objectMapper = new ObjectMapper();

        ResultObj resultObj = new ResultObj();
        //判断空串
        if (token == null || token.isEmpty()) {

            resultObj.code(555).setMsg("未登录");

            response.getWriter().write(objectMapper.writeValueAsString(resultObj));
            return false;
        }

        TokenEnum tokenEnum = JWTUtil.verify(token);

        if (tokenEnum == TokenEnum.TOKENEXPIRE) {

            //过期
            resultObj.code(555).setMsg("过期");

            response.getWriter().write(objectMapper.writeValueAsString(resultObj));
            return false;

        }
        if (tokenEnum == TokenEnum.TOKENINVALID) {

            //过期
            resultObj.code(555).setMsg("非法");

            response.getWriter().write(objectMapper.writeValueAsString(resultObj));
            return false;

        }
        if (tokenEnum == TokenEnum.TOKENSUCCESS) {

            //过期
            return true;

        }
        return false;
    }
}
