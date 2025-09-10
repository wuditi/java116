package com.wn.boot.exception;


import com.wn.boot.utils.resultObj;
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
}


