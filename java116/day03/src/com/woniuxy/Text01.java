package com.woniuxy;

import java.util.Scanner;

public class Text01 {

    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);


        //if elseif 多方向
        System.out.println("输入第一个整数数字");
        int num1 = score.nextInt();
        System.out.println("输入第二个整数数字");
        int num2 = score.nextInt();
        System.out.println("请输入运算符");
        String math = score.next();
        boolean mathFlag = true;
        if (math.equals("+")) {
            System.out.println(num1 + num2);
        } else if (math.equals("-")) {
            System.out.println(num1 - num2);
        } else if (math.equals("*")) {
            System.out.println(num1 * num2);
        } else if (math.equals("/")) {
            System.out.println(num1 / num2);

        }
    }
}
