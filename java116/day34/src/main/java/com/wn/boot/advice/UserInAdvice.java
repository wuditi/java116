package com.wn.boot.advice;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserInAdvice {

    @Before("execution(* com.wn.boot.controller.UserController.*(..))")
    public void userAdvice() {

        System.out.println("前置增强");

    }


}
