package com.woniuxy;

import java.util.Scanner;

public class Text004 {

    public static void main(String[] args) {
        //随机数生成方法


        int num = (int) (Math.random() * 100);
        System.out.println(num);
        System.out.println("系统已生成随机数");
        Scanner sc = new Scanner(System.in);

        int num2;
        int count = 0;
        do {
            System.out.println("请输入你要猜的数字");
            num2 = sc.nextInt();

            if (num > num2) {
                System.out.println("数字比你猜的大，请重新输入");

            } else if (num < num2) {
                System.out.println("数字比你猜的小，请重新输入");

            }
            ++count;
            System.out.println("还剩余" + (5 - count) + "次机会");

        } while (num2 != num && count != 5);
        if (count == 5) {
            System.out.println("超出次数");
        } else {
            System.out.println("猜对了");
        }

    }
}

