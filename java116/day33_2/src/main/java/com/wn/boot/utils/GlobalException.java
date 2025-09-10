package com.wn.boot.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public resultObj globalExp(Exception exception) {
        exception.printStackTrace();
        System.out.println("---全局异常---");
        return resultObj.failed();
    }

    @ExceptionHandler(NullPointerException.class)
    public resultObj globalExp(NullPointerException nullPointerException) {
        nullPointerException.printStackTrace();
        System.out.println("---空指针异常---");
        return resultObj.failed().msg("空指针异常");
    }


}
