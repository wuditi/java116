package com.woniuxy02;

public class CreatCar {
    //普通工厂
    public static Car creatcar(String car) {
        Car c = null;
        switch (car) {
            case "Byd":
                c = new Byd();
                break;
            case "Bnze":
                c = new Bnze();
                break;
            default:
                break;

        }
        return c;

    }

}
