package com.woniuxy;

import java.util.Scanner;

public class Text08 {

    public static void main(String[] args) {

        //判断账号密码是否正确
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("请输入账号");
            String admin = sc.next();
            System.out.println("请输入密码");
            int password = sc.nextInt();

            if (admin.equals("admin") && password == 62121) {
                System.out.println("登录成功");
                break;
            }
            System.out.println("账号或密码错误还剩" + (3 - i) + "次机会");
        }

    }
}
