package com.woniuxy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text02 {

    public static void main(String[] args) {

        //单独写方法去实现
        //声明两个变量去当作下标
        //charAt取出元素，挨个去比较
        String s = "abjavcdejav";
        String t = "java";
        int sFlag = 0;
        int tFlag = 0;
        while (sFlag < s.length() && tFlag < t.length()) {
            if (s.charAt(sFlag) == t.charAt(tFlag)) {
                sFlag++;
                tFlag++;

            } else {

                sFlag++;

            }


        }
        if (tFlag == t.length()) {
            System.out.println("成功");
        } else {

            System.out.println("失败");
        }


    }

//chaAt方法用于将字符串中单个字符都取出
}
