package com.wn.day32.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("forWord01")
    public void forWord01(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/login.html").forward(request, response);

    }

    @RequestMapping("redirect01")
    public void redirect01(HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("redirect:/login.html");

    }


    @RequestMapping("forWord02")
    public ModelAndView forWord02() throws ServletException, IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login.html");

        return modelAndView;
    }

    @RequestMapping("redirect02")
    public ModelAndView redirect02() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login.html");

        return modelAndView;

    }


}
