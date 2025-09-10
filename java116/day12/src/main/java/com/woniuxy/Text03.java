package com.woniuxy;

import java.math.BigDecimal;

public class Text03 {


    public static void main(String[] args) {
        //nt[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] b = Arrays.copyOf(a, 20);
        StringBuffer sb = new StringBuffer("asdadawd");
        sb.append("edsf");
        System.out.println(sb);
        sb.insert(3, "asas");
        System.out.println(sb);
        //System.out.println(Arrays.toString(b));
    }
}

class Tezt04 {

    public static void main(String[] args) {

        BigDecimal big = new BigDecimal("11212121212121212121");
        BigDecimal big2 = new BigDecimal("11212121212121212121");
        BigDecimal add = big.add(big2);
        System.out.println(add.setScale(2, BigDecimal.ROUND_HALF_UP));
        BigDecimal sub = new BigDecimal("1000000000");
        BigDecimal sub2 = new BigDecimal("3000");
        System.out.println();
    }

}
