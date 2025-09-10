package com.woniuxy;

import java.text.DateFormat;
import java.util.Calendar;

public class Text05 {

    public static void main(String[] args) {
        //Calendar类型试验
        //获取日历对象
        Calendar calendar = Calendar.getInstance();
        //calendar.set();
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
