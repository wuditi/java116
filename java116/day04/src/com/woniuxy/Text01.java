package com.woniuxy;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        int num2;
        boolean flag;

        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        System.out.println(num);
        System.out.println("系统已生成随机数");

        for (int i = 1; i <= 3; i++) {

            System.out.println("请输入你要猜的数字");
            num2 = sc.nextInt();
            if (num < num2) {
                System.out.println("猜大了");
                System.out.println("还剩余" + (3 - i) + "次机会");
            } else if (num > num2) {
                System.out.println("猜小了");
                System.out.println("还剩余" + (3 - i) + "次机会");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        game();

    }

    //继续游戏方法
    public static void game() {
        int num2;
        boolean flag;
        for (; ; ) {
            System.out.println("是否继续游戏");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            if (str.equals("yes")) {
                int num = (int) (Math.random() * 100);
                System.out.println(num);
                System.out.println("系统已生成随机数");

                for (int i = 1; i <= 3; i++) {

                    System.out.println("请输入你要猜的数字");
                    num2 = sc.nextInt();
                    if (num < num2) {
                        System.out.println("猜大了");
                        System.out.println("还剩余" + (3 - i) + "次机会");
                    } else if (num > num2) {
                        System.out.println("猜小了");
                        System.out.println("还剩余" + (3 - i) + "次机会");
                    } else {
                        System.out.println("猜对了");
                        break;
                    }
                }
            } else if (str.equals("no")) {
                break;
            }

        }
    }


}
