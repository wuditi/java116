package com.woniuxy;

public class Text01 {
    public static void main(String[] args) {
        //数组反转，对称位置交换
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        for (int i = 0; i <= arr1.length / 2; i++) {
            int num = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = num;

        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }

    }
}
