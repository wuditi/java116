package com.woniuxy;

import java.util.Scanner;

public class Text04 {
    public static void main(String[] args) {
        int[] put = {4, 5, 46, 7, 45, 12, 0, 0, 0};

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要添加的数字以及要添加的位置下标：");
        int putNum = sc.nextInt();
        int flagNum = sc.nextInt();

        //  正确扩容：长度+1（别写死）
        int[] b = new int[put.length + 1];
        for (int j = 0; j < put.length; j++) {
            b[j] = put[j];
        }
        put = b; // 用新数组覆盖

        //  先把新值放到 flagNum
        put[flagNum] = putNum;

        //  正确的交换法：从插入点开始，一直和后面交换
        for (int i = flagNum; i < put.length - 1; i++) {
            int temp = put[i];
            put[i] = put[i + 1];
            put[i + 1] = temp;
        }

        //  输出看看
        for (int m = 0; m < put.length; m++) {
            System.out.print(put[m] + " ");
        }


    }

}
