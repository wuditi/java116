package com.woniuxy;

import java.util.Arrays;
import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        //数组查找
        int[] find = new int[10];
        for (int i = 0; i < 10; i++) {
            find[i] = i + 10;
            System.out.println(find[i] + "\t");
        }
        System.out.println("输入你要查找的数字，返回数字的下标");
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        for (int j = 0; j < 10; j++) {
            if (n == find[j]) {
                System.out.println(j);
            }
        }
        Arrays.toString(find);

    }
}
