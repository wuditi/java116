package com.wn.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdviceUserService {


    //    @After("execution(* com.wn.aop.impl.UserServiceImpl.login(..))")
//    public void adviceUser() {
//
//        System.out.println("打印日志");
//
//    }
//
//    @Before("execution(* com.wn.aop.impl.UserServiceImpl.login(..))")
//    public void selectAdviceUser(JoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//        System.out.println("检测");
//        for (Object arg : args) {
//            System.out.println(arg);
//        }
//    }


//    @Pointcut("execution(* com.wn.aop.impl.UserServiceImpl.login(..))")
//    public void point() {
//    }

    @Pointcut("@annotation(com.wn.annotation.AdviceLog)")
    public void point() {
    }

    @Around("point()")
    public Object closeUser(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前置");
        Object object = joinPoint.proceed();
        System.out.println("环绕后置");
        System.out.println(object);
        return object;
    }

    @AfterThrowing(value = ("execution(* com.wn.aop.impl.UserAdviceServiceImpl.login(..))"), throwing = "exception")
    public void exUserAdvice(Exception exception) throws Throwable {


        System.out.println("异常增强");

    }


}
