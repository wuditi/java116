//声明包
package com.woniuxy;
//导入包

import java.util.Scanner;

public class Text04 {

    public static void main(String[] args) {

        //键盘输入
        //调用方法
        //scanner;类 对象=new 构造方法（参数） 对象就是一个变量
        //Scanner score= new Scanner(System.in);
        Scanner score = new Scanner(System.in);
        System.out.println("输入Java成绩");
        int java = score.nextInt();
        System.out.println("输入html成绩");
        int html = score.nextInt();
        System.out.println("输入sql成绩");
        int sql = score.nextInt();

    }
}
