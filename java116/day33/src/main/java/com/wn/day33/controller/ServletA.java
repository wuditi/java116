package com.wn.day33.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("ServletA")
@Controller
public class ServletA {

    @RequestMapping("pageA")
    public ModelAndView pageA() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login.html");
        return mv;

    }

}
