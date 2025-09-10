package com.woniuxy02;

public class Cat extends Animals {

    String color;

    public Cat(String name, int age, String sex, String color) {
        super();
        this.color = color;

    }

    //   方法重写
    @Override
    public String toString() {
        super.toString();
        return super.toString() + this.color;
    }

}
