package com.woniuxy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;
import java.util.zip.DataFormatException;

public class Text03 {
    public static void main(String[] args) {

        String str = "2021-2-1";
        log(str);

    }

    private static Date log(String str) {
        try {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
            date = dateFormat.parse(str);
            System.out.println(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}




