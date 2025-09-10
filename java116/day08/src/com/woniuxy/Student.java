package com.woniuxy;

import java.sql.SQLOutput;

public class Student {
    String name;
    int age;
    static String gender;

    public Student() {
        name = "zhangsan";
        age = 18;
        gender = "meal";

    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public static void Student() {

        System.out.println("静态方法");
    }

    public void notstaticStudent() {

        System.out.println("非静态方法");
    }

}
