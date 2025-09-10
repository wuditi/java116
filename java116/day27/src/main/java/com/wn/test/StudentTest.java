package com.wn.test;

import com.wn.annotation.SetAnnotaation;
import com.wn.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

//        Student student = new Student();
//        Class aClass = student.getClass();
//        Field[] fields = aClass.getDeclaredFields();
//        for (Field field : fields) {
//            field.setAccessible(true);
//            System.out.println(field.getName());
//            //获得了自定义注解的类
//            //
//            SetAnnotaation setAnnotaation = field.getDeclaredAnnotation(SetAnnotaation.class);
//            if (setAnnotaation != null) {
//                String value = setAnnotaation.value();
//
//                if (field.getName().equals("age")) {
//
//                    int age = Integer.parseInt(setAnnotaation.value());
//
//                    student.setAge(age);
//                    //field.set(student, age);
//                } else {
//                    student.setName(value);
//                    //field.set(student, value);
//                }
//
//            }
//
//        }
//
//        System.out.println(student);


        Student student = new Student();
        Class aClass = student.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method.getName());
            //获得了自定义注解的类
            SetAnnotaation setAnnotaation = method.getDeclaredAnnotation(SetAnnotaation.class);
            if (setAnnotaation != null) {
                String value = setAnnotaation.value();

                if (method.getName().equals("setAge")) {

                    int age = Integer.parseInt(setAnnotaation.value());

                    method.invoke(student, age);
                    //field.set(student, age);
                } else {
                    method.invoke(student, value);
                    //field.set(student, value);
                }

            }

        }

        System.out.println(student);


    }

}

