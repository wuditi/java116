package com.woniuxy;

public class Singleton {

    private Singleton() {
    }


    public static Singleton getSingleton() {
        return singleton;
    }

    private static Singleton singleton;

    public static Singleton creatInters() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
