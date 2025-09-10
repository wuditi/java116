package com.wn.day35.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ResultObj globalExp(Exception exception) {
        exception.printStackTrace();
        System.out.println("---全局异常---");
        return ResultObj.failed();
    }

    @ExceptionHandler(NullPointerException.class)
    public ResultObj globalExp(NullPointerException nullPointerException) {
        nullPointerException.printStackTrace();
        System.out.println("---空指针异常---");
        return ResultObj.failed().msg("空指针异常");
    }

}
