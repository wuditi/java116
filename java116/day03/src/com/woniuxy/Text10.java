package com.woniuxy;

import java.util.Scanner;

public class Text10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要判断的数字");

        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }

    }
}
