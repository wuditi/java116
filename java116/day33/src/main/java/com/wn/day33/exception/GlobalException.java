package com.wn.day33.exception;

import com.wn.day33.utils.Utils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public Utils globalExp(Exception exception) {
        exception.printStackTrace();
        System.out.println("---全局异常---");
        return Utils.failed();
    }

    @ExceptionHandler(NullPointerException.class)
    public Utils globalExp(NullPointerException nullPointerException) {
        nullPointerException.printStackTrace();
        System.out.println("---空指针异常---");
        return Utils.failed().msg("空指针异常");
    }

    @ExceptionHandler(NamedExpection.class)
    public Utils nameExpect(NamedExpection nameExpection) {
        nameExpection.printStackTrace();
        return Utils.failed();
    }

}
