package com.woniuxy;

public class Text04 {
    public static void main(String[] args) {

        //折半查找
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int he = 1;
        int ed = arr.length;//下标统一向前加一就可以计算出需要去二分的地方
        int find = 7;

        while ((he + ed) / 2 != find) {

            if ((he + ed) / 2 > find) {

                ed = ((he + ed) / 2) - 1;

            } else if ((he + ed) / 2 < find) {

                he = ((he + ed) / 2) + 1;
                ed = arr.length;
            }

        }
        System.out.println(((he + ed) / 2) - 1);
    }
}
