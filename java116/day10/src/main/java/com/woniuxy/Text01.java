package com.woniuxy;

public class Text01 {
    public static void main(String[] args) {
        Animals animal1 = new Animals("DSDS", 12, "WW");
        Animals animal2 = new Animals("DSDS", 13, "WW");
        Animals animal3 = new Animals("DSD4", 14, "WW");
        Animals animal4 = new Animals("DSDS", 12, "WW");

        System.out.println(animal1 == animal4);

        System.out.println(animal1.equals(animal4));


    }
}
