package com.woniuxy;

public class Text03 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr1 = {14, 26, 36, 64, 95, 67, 97, 83, 94};
        for (int i = 0; i < arr1.length - 1; i++) {

            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
