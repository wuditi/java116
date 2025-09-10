package com.woniuxt02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Arrays {

    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add("sdad");
        list.add(1);
        list.add(2.3);
        list.add(true);
        System.out.println(list);
        Collection list2 = new ArrayList();
        list2.addAll(list);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
        System.out.println(list.contains("a"));
        System.out.println(list2.isEmpty());
        //System.out.println(list.iterator());
//        String[] res = new String[list.size()];
//        res = (String[]) list.toArray(res);
//        System.out.println(res);
          
    }
}
