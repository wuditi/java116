package com.woniuxy;

import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Text01 {

    public static void main(String[] args) {
        int[] a = {1, 4, 52, 6, 88, 4};
        MyUntil su = new MyUntil();
        su.sort(a);
        System.out.println(Arrays.toString(a));

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要打印字符的个数");
        int n = sc.nextInt();
        System.out.println("输入要打印的字符");
        String s = sc.next();
        su.printflag(n, s);
        //加和
        System.out.println("输入要加和的两个数字");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = su.sum(x, y);


        a = su.addArray(a, 4);
        System.out.println(Arrays.toString(a));

        System.out.println(su.arrayToString(a));

    }

}
