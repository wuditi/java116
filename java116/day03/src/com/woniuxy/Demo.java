package com.woniuxy;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {10, 13, 414, 55, 16};

    }


    //方法的重载
    //允许返回值和参数类型个数可以不同，允许方法名相同，复用
    public static int sum(int num1, int num2) {

        return num1 + num2;
    }


    public static Double sum(Double num1, Double num2) {

        return num1 + num2;
    }


}

