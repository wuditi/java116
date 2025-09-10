package com.woniuxy02;

import java.util.Scanner;

public class Person {


    public void peopleInput() {

        // 人输入手势
        int numPlayer;
        Scanner Player = new Scanner(System.in);
        numPlayer = Player.nextInt();
    }

    public void showHead(int numPlayer) {
        switch (numPlayer) {
            case 1:
                System.out.println("剪刀");
                break;
            case 2:
                System.out.println("石头");
                break;
            case 3:
                System.out.println("布");
                break;
            default:
                break;
                
        }


    }

}
