//声明包
package com.woniuxy;
//导入包

import java.util.Scanner;

public class Play {

    public void draw(int h) {

        for (int m = 0; m <= h + 1; m++) {
            for (int n = 0; n <= h + 1; n++) {
                //判断外边框的输入位置，
                if ((m == 0 && n >= 0) || (n == 0 && m > 0) || (m == h + 1 && h + 1 > n && n > 0)
                        || (n == h + 1 && m > 0)) {
                    System.out.print(" ");
                    System.out.print("*");
                } else if (n == (h + 3) / 2 - m || n == (h - 1) / 2 + m || n == m - (h - 1) / 2
                        || n == (3 * h + 1) / 2 - m) {
                    System.out.print(" ");
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
         * for (int i=1;i<=h;i++){ //逐行打印 for (int j=1;j<=h;j++){
         * //每行打印个数数行数保持一致 //下面是菱形四天便的函数，在边上的坐标点打印*，否则打印空格 if
         * (j==(h+3)/2-i||j==(h-1)/2+i||j==i-(h-1)/2||j==(3*h+1)/2-i){
         * System.out.print("*"); }else { System.out.print(" "); } }
         * System.out.println(); }
         */
    }

    public static void main(String[] args) {
        Play p = new Play();
        System.out.println("请输入大于1的奇数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        p.draw(a);
    }
}

