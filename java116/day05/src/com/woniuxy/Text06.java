package com.woniuxy;

import java.util.Scanner;

public class Text06 {
    public static void main(String[] args) {
//        //输出一个杨辉三角
//        System.out.println("请输入需要输出三角的行数");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[][] yangHui = new int[num][];
//        for (int i = 0; i < num; i++) {
//            yangHui[i] = new int[i + 1];
//            for (int j = 0; j <= i; j++) {
//                if (i == 0 || j == i) {
//                    yangHui[i][j] = 1;
//                } else {
//                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
//                }
//
//                System.out.print(yangHui[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
        System.out.println("请输入需要输出三角的行数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] yangHui = new int[num][];
        for (int i = 0; i < num; i++) {
            yangHui[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}






