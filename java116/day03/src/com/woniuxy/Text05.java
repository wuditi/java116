package com.woniuxy;

import java.util.Scanner;

public class Text05 {

    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (num <= 100) {

            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
