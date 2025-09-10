package com.wn.entity;

import com.wn.annotation.SetAnnotaation;

public class Student {
    //@SetAnnotaation(value = "aaa")
    private String name;
    //@SetAnnotaation(value = "11")
    private int age;


    @SetAnnotaation(value = "11")
    public void setAge(int age) {
        this.age = age;
    }

    @SetAnnotaation(value = "aaa")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
