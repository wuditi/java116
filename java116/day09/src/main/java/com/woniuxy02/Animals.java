package com.woniuxy02;

import org.w3c.dom.ls.LSOutput;

public class Animals {
    private String name;
    private int age;
    private String sex;

    //无参构造
    public Animals() {

    }

    public Animals(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public String toString() {
        return "Name: " + name;
    }

    public String getName() {
        return name;
    }
}

class fish extends Animals {


    public void swim() {

        System.out.println("开始游泳");

    }
}

