package com.woniuxy;

import java.util.ArrayList;

import static com.woniuxy.Text06.Deduplication2;

public class Text07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100));
            Deduplication2(list);
        }
        System.out.println(list);
    }
}
