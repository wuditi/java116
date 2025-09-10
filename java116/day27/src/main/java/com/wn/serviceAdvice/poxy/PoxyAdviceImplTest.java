package com.wn.serviceAdvice.poxy;

import com.wn.service.UserService;
import com.wn.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PoxyAdviceImplTest {
    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserService userService = (UserService) Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(), userServiceImpl.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("前置增强");
                //执行
                Object object = method.invoke(userServiceImpl, args);

                System.out.println("后置增强");
                return object;
            }
        });
        System.out.println(userService.login("aaa", "a"));
    }

}
