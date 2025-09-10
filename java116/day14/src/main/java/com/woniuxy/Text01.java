package com.woniuxy;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Text01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "a");
        map.put(2, "a");
        map.put(3, "a");
        map.put(4, "a");
        map.put(5, "a");
        map.put(6, "a");
//        HashMap<Integer, String> hashMap = new HashMap();
//        hashMap.put(1, "zs,12,133");
//        hashMap.put(122, "zs,12,133");
//        hashMap.put(14, "zs,12,133");
//        hashMap.put(1, "zs,12,133");
        Set<Integer> key = map.keySet();

        for (Integer i : key) {
            System.out.println(map.get(i));
        }

        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }
    }


}
