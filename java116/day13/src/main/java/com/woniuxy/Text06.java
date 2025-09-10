package com.woniuxy;

import javax.management.modelmbean.DescriptorSupport;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class Text06 {
    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList();
        strs.add("aaa");
        strs.add("bbb");
        strs.add("ccc");
        strs.add("ddd");
        strs.add("ddd");
        strs.add("aaa");

        System.out.println(Deduplication2(strs));


    }

//    public static ArrayList Deduplication(ArrayList str) {
//        for (int i = 0; i < str.size(); i++) {
//
//            for (int j = i + 1; j < str.size(); j++) {
//                if (str.get(i).equals(str.get(j))) {
//                    str.set(j, "0");
//                }
//            }
//        }
//        for (int m = 0; m < str.size(); m++) {
//            if (str.get(m).equals("0")) {
//                str.remove(m);
//            }
//        }
//        return str;
//    }

    public static ArrayList Deduplication2(ArrayList<String> str) {

        ArrayList list = new ArrayList();
        for (Object s : str) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        return list;
    }

}
