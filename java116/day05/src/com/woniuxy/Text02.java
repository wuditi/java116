package com.woniuxy;

import java.util.Scanner;

public class Text02 {
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

        maxMin(find);

    }

    public static void maxMin(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println(max + "与" + min);
    }


}
