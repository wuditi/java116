package com.woniuxy;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {

        int numPlayer;
        int numRoboot;

        while (true) {

            System.out.println("石头剪刀布游戏开始，请输入您要出的对应手势的数字。1剪刀 2石头 3布");
            Scanner Player = new Scanner(System.in);
            numPlayer = Player.nextInt();
            //机器产生随机数与玩家比较
            numRoboot = (int) (((Math.random() * 100) % 3) + 1);
            System.out.println(numRoboot);


            if (numPlayer == 1 && numRoboot == 3 || numPlayer == 2 && numRoboot == 1 || numPlayer == 3 && numRoboot == 2) {

                System.out.println("你获得胜利");
                headFlag(numPlayer);
                System.out.print("vs");
                headFlag(numRoboot);
                System.out.println();

            } else if (numRoboot == 1 && numPlayer == 3 || numRoboot == 2 && numPlayer == 1 || numRoboot == 3 && numPlayer == 2) {

                System.out.println("你输了");
                headFlag(numPlayer);
                System.out.print("vs");
                headFlag(numRoboot);
                System.out.println();

            } else if (numPlayer == numRoboot) {
                System.out.println("平局，请继续输入");
                headFlag(numPlayer);
                System.out.print("vs");
                headFlag(numRoboot);
                System.out.println();
            }
            System.out.println("是否继续游戏，y/n");
            String answer = Player.next();
            if (answer.equals("n")) {
                break;
            }
        }

    }

    //将数字展示成不同手势
    public static void headFlag(int num) {

        if (num == 1) {
            System.out.print("剪刀");
        } else if (num == 2) {
            System.out.print("石头");
        } else if (num == 3) {
            System.out.print("布");
        }

    }
}




