//声明包
package com.woniuxy;
//导入包

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Text05 {

    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);


        //if elseif 多方向
        System.out.println("输入sql成绩");
        int sql = score.nextInt();
        if (sql < 50) {
            System.out.println("不及格");
        } else if (sql <= 80) {
            System.out.println("及格");
        } else if (sql > 80) {
            System.out.println("优秀");
        }

    }
}

