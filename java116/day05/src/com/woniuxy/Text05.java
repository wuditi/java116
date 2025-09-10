package com.woniuxy;

import java.util.Scanner;

public class Text05 {
    public static void main(String[] args) {
        //在数组中添加，自动扩容
        int[] put = {4, 5, 46, 7, 45, 12, 0, 0, 0};
        int index = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要添加的数字已及要添加的位置下标");
        int putNum = sc.nextInt();
        int flagNum = sc.nextInt();
        // 创建一个新数组，长度+1
        int[] newPut = new int[put.length + 1];

        // 复制 flagNum 之前的元素
        for (int i = 0; i < flagNum; i++) {
            newPut[i] = put[i];
        }
        put = newPut;


    }

}

