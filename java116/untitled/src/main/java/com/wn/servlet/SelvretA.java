package com.wn.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet
public class SelvretA implements Servlet {

    //创建新对象，是单例的
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("创建");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //执行各种请求
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public String getServletInfo() {
        return "";
    }


    //销毁
    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
