package com.wn.annotation;


import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface MyAnnotation {

    String value() default "";

    int id() default 0;


}
