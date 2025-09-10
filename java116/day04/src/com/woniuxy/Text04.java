package com.woniuxy;

import java.util.Scanner;
import java.lang.Math;

public class Text04 {
    public static void main(String[] args) {
        //计算
        /**
         *
         */
        System.out.println("请输入整数a和n");
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numN = sc.nextInt();
        int sum = numA;
        for (int i = 1; i < numN; i++) {
            sum = (int) (numA + (numA * Math.pow(10, i) + sum));//错误了，仔细思考一下
        }
        System.out.println(sum);
    }

}

