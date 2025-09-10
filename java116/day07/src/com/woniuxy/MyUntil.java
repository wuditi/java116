package com.woniuxy;

public class MyUntil {
    //冒泡排序
    public void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    //打印字符
    public void printflag(int a, String b) {

        for (int i = 0; i < a; i++) {
            System.out.print(b);
        }
    }

    //求和运算
    public int sum(int x, int y) {

        int sum = 0;
        sum = x + y;
        return sum;
    }

    //斐波那契数列
    public void Fs(int a, int n) {


    }

    //数组元素查找
    public void main(int[] arr, int n) {


        for (int j = 0; j < arr.length; j++) {
            if (n == arr[j]) {
                System.out.println(j);
                break;
            }
        }
    }

    //判断是否为质数
    public boolean judgMent(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //自定义数组输出
    public String arrayToString(int[] a) {
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            str = str + (a[i] + ",");
            if (i == a.length - 1) {
                str += a[i];
            }

        }
        str += "]";

        return str;
    }

    //数组扩容
    public int[] addArray(int[] a, int b) {


        int[] add = new int[a.length + b];
        for (int i = 0; i < a.length; i++) {
            add[i] = a[i];
        }
        return add;
    }
    //方法重构


}