package com.woniuxy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Text09 {

    public static void main(String[] args) {

        System.out.println("是否是会员 yes/no");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入实际应付金额");
        int price= sc.nextInt();

        String answer=sc.next();
        if(answer.equals("yes")){
            if(price>=200){
                System.out.println(price*=0.9);
            }else if(price<200){
                System.out.println(price*=0.7);
            }
        }
        if(answer.equals("no")){
            if(price>=100){
                System.out.println( price*=0.7);
            }else if(price<100){
                System.out.println(price*=0.8);
            }
        }

    }
}
