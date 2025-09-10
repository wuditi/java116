package com.woniuxy;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Homework {
    public static void main(String[] args) {

        Scanner score = new Scanner(System.in);
        System.out.println("输入Java成绩");
        int java = score.nextInt();
        System.out.println("输入html成绩");
        int html = score.nextInt();
        System.out.println("输入sql成绩");
        int sql = score.nextInt();
        int sum = java + html + sql;
        System.out.println("总成绩:" + sum);
        int average = sum / 3;
        System.out.println("平均分：" + average);


    }
}
