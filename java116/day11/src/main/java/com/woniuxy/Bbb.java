package com.woniuxy;

interface MyInterface {
    int calc(int a, int b);
}

class Ccc {
    public int getResult(int a, int b, MyInterface myInterface) {
        return myInterface.calc(a, b);
    }
}

public class Bbb {
    public static void main(String[] args) {
        Ccc ccc = new Ccc();
        MyInterface myInterface = new MyInterface() {
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };
        ccc.getResult(1, 2, myInterface);

    }
}

