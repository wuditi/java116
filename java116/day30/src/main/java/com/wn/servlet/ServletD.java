package com.wn.servlet;

import com.wn.entity.User;
import com.wn.untils.SelvertUntil;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/ServletD")
public class ServletD extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            User user = SelvertUntil.getBean(req.getParameterMap(), User.class);
            System.out.println(user);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
