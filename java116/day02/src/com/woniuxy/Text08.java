//声明包
package com.woniuxy;
//导入包

import java.util.Scanner;

public class Text08 {

    public static void main(String[] args) {

        //键盘输入
        //调用方法
        //scanner;类 对象=new 构造方法（参数） 对象就是一个变量
        //Scanner score= new Scanner(System.in);
        Scanner student = new Scanner(System.in);

        System.out.println("输入姓名");
        String name = student.next();

        System.out.println("输入年龄");
        int age = student.nextInt();

        System.out.println("输入身高");
        int height = student.nextInt();

        System.out.println("输入体重");
        int weight = student.nextInt();

        System.out.println("输入性别");
        String gender = student.next();

        System.out.println("输入成绩");
        int score = student.nextInt();

        //输出对应的信息

        System.out.println("请输入需要查询的信息");
        String find = student.next();
        if (find.equals("name")) {
            System.out.println(name);
        } else if (find.equals("age")) {
            System.out.println(age);
        } else if (find.equals("height")) {
            System.out.println(height);
        } else if (find.equals("weight")) {
            System.out.println(weight);
        } else if (find.equals("gender")) {
            System.out.println(gender);
        } else if (find.equals("score")) {
            System.out.println(score);
        }


    }
}
