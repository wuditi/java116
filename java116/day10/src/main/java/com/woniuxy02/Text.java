package com.woniuxy02;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        Scanner sc = new Scanner(System.in);
        String flag = sc.next();
        car = CreatCar.creatcar(flag);
        car.run();

    }
}
