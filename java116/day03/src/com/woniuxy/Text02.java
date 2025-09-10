package com.woniuxy;

import java.util.Scanner;

public class Text02 {

    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        System.out.println("输入学生性别");
        String gender = student.next();
        System.out.println("输入学生成绩");
        double score = student.nextDouble();
        if (score <= 10 && score >= 0) {
            System.out.println("入选运动队");
            switch (gender) {
                case "男":
                    System.out.println("进入男队");
                    break;
                case "女":
                    System.out.println("进入女队");
                    break;
                default:
            }
        } else {
            System.out.println("成绩未达标");
        }

    }
}
