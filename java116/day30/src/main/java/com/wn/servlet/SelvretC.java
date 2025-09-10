package com.wn.servlet;

import javax.lang.model.element.Element;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/selvretC")
public class SelvretC extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        String name = req.getParameter("name");
//        String pas = req.getParameter("pas");
//        System.out.println(name + pas);
//        Enumeration<String> names = req.getParameterNames();
//        while (names.hasMoreElements()) {
//
//        }

        String method = req.getMethod();
        System.out.println(method);


    }
}
