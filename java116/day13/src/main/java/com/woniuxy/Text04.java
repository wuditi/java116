package com.woniuxy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text04 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间并以Date类型
        Date date = new Date(1000);
        System.out.println(date);
        //设置日期的部分
        //设置好date要转为String的模式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = dateFormat.format(date);//.format方法转化
        System.out.println(str);
        Date date2 = dateFormat.parse(str);
        System.out.println(date2);
        
    }
}




