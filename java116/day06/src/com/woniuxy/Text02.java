package com.woniuxy;

import java.util.Scanner;

public class Text02 {
    public static void main(String[] args) {
        //数组添加元素
        /**
         * 不是用的在一个数组中交换的方法去写的
         * 原理是。新建了一个新的扩容好的数组之后，先把要插入的下标前的原数组的数值先复制回去，之后再
         * 把要插入的数字和此下标之后的数值复制回去，统一向后移一位
         */
        int[] put = {4, 5, 46, 7, 45, 12, 0, 0, 0};

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要添加的数字以及要添加的位置下标");
        int putNum = sc.nextInt();
        int flagNum = sc.nextInt();

        // 创建一个新数组，长度+1
        int[] newPut = new int[put.length + 1];

        // 复制 flagNum 之前的元素
        for (int i = 0; i < flagNum; i++) {
            newPut[i] = put[i];
        }

        // 插入新值
        // newPut[flagNum] = putNum;

        // 复制 flagNum 及其后的元素，后移一位
        for (int i = flagNum; i < put.length; i++) {
            newPut[i + 1] = put[i];
        }
        newPut[flagNum] = putNum;
        // 用新数组覆盖旧数组
        put = newPut;

        // 输出结果
        for (int i = 0; i < put.length; i++) {
            System.out.println(put[i]);
        }

    }
}
