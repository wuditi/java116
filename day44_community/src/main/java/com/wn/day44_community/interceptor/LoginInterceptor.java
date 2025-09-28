package com.wn.day44_community.interceptor;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.wn.day44_community.entity.UserInfo;
import com.wn.day44_community.utils.JWTUtil;
import com.wn.day44_community.utils.ResultObj;
import com.wn.day44_community.utils.TokenEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        //获取url
        String url = request.getRequestURI();
        //请求头中获取token
        String token = request.getHeader("token");
        //转换json
        ObjectMapper objectMapper = new ObjectMapper();

        ResultObj resultObj = new ResultObj();
        //判断空串
        if (token != null && !token.trim().isEmpty()) {
            TokenEnum tokenEnum = JWTUtil.verify(token);
            if (tokenEnum == TokenEnum.TOKENSUCCESS) {
                //获取token过期时间
                //获取当前token中用户信息
                Long id = JWTUtil.getUid(token);
                String username = JWTUtil.getUname( token);
                //重新生成token响应给前端
                UserInfo userInfo = new UserInfo();
                userInfo.setId(id.intValue());
                userInfo.setUsername(username);
                String newToken = JWTUtil.generateToken(userInfo);
               // 设置响应头信息
                //将token放进响应头中
                response.setHeader("token",newToken);
                //前后端分离的项目，必须暴露响应头，否则前端收不到响应头
                response.setHeader("Access-Control-Expose-Headers","token");
                return true;//放行
            } else if (TokenEnum.TOKENEXPIRE == tokenEnum) { //表示token已过期
                //响应json数据异常信息给前端
                resultObj.code(525).msg("你的token已过期");
                //把resultObj对象转换成json字符串
                String responseStr = objectMapper.writeValueAsString(resultObj);
                //通过response对象响应给前读研
                response.getWriter().write(responseStr);
                return false;
            } else { //表示非法token
                //响应json数据异常信息给前端
                resultObj.code(526).msg("非法token");
                //把resultObj对象转换成json字符串
                String responseStr = objectMapper.writeValueAsString(resultObj);
                //通过response对象响应给前读研
                response.getWriter().write(responseStr);
                return false;
            }
        } else { //表示用户未登录
            //响应json数据异常信息给前端
            resultObj.code(524).msg("请求中未携带token");
            //把resultObj对象转换成json字符串
            String responseStr = objectMapper.writeValueAsString(resultObj);
            //通过response对象响应给前读研
            response.getWriter().write(responseStr);
            return false; //拦截
        }


    }

}

