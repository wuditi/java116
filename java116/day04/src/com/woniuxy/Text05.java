package com.woniuxy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Text05 {
    public static void main(String[] args) {

        /** 用动态数组去实现斐波那契数列
         *  只需要动态的添加新的参数即可
         */
//        //斐波那契数列
//        System.out.println("请输入需要求第几月的兔子");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //前两月已知
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
//        int sum = list.get(0) + list.get(1);
//
//        for (int j = 0; j <= n; j++) {
//
//            sum = list.get(j) + list.get(j + 1);
//            list.add(sum);
//
//        }
//        System.out.println(list.get(n - 1));

        /**
         * 用for循环的嵌套实现斐波那契数列
         */
        System.out.println("请输入需要求第几月的兔子");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //前两月已知
        int n1 = 1;
        int n2 = 1;
        int sum = 0;

        for (int j = 0; j < n - 2; j++) {

            sum = n1 + n2;
            n1 = n2;
            n2 = sum;

        }

        System.out.println(sum);
    }

}

