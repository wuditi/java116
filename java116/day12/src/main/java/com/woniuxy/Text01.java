package com.woniuxy;

import java.util.Scanner;

public class Text01 {

    public static void main(String[] args) {
        String num = "abjavacdejavafghijjavakljava";
        String flag = "flag";
        int count = -1;
        int start = 0;
        int indexOf;
        do {
            indexOf = num.indexOf("java", start);
            count++;
            start = indexOf + flag.length();
        } while (indexOf != -1);
        System.out.println(count);


        //判断qq号是否正确
        String num2 = "";
        Scanner sc = new Scanner(System.in);
        num2 = sc.next();
        char[] toCharArray2 = num2.toCharArray();
        if (toCharArray2.length >= 5 && toCharArray2.length <= 15 && toCharArray2[0] != '0') {
            for (int i = 0; i < toCharArray2.length; i++) {
                if (toCharArray2[i] >= '0' && toCharArray2[i] <= '9') {
                    System.out.println("正常QQ号");
                }
            }
        } else {
            System.out.println(false);
        }

    }
}
