package com.woniuxy;

public class Animals {
    public String name;
    public int age;
    public String sex;

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

    public void eat() {
        System.out.println("动物吃饭");
    }


    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Animals) {
            Animals as = (Animals) obj;
            if (this.name.equals(as.name) && this.age == as.age && this.sex.equals(as.sex)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }


}

class fish extends Animals {


    public void swim() {

        System.out.println("开始游泳");

    }


}
