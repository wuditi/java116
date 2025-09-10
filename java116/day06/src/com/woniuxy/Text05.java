package com.woniuxy;

import java.util.Scanner;

public class Text05 {
    public static void main(String[] args) {
        System.out.println("输入人数");
        Scanner sc = new Scanner(System.in);
        int personNum = sc.nextInt();
        System.out.println("输入倒霉数字");
        int unluckyNum = sc.nextInt();
        int arr2 = personNum;
        int count = 0;
        boolean[] people = new boolean[personNum];

        for (int i = 0; i < personNum; i++) {
            people[i] = true;
        }
        System.out.println();

        do {
            for (int j = 0; j < personNum; j++) {

                if (people[j]) {
                    count++;
                    if (count % unluckyNum == 0) {
                        people[j] = false;
                        arr2--;
                    }
                }

            }

            if (arr2 == 1) {
                break;
            }

        } while (true);

        for (int i = 0; i < personNum; i++) {
            if (people[i]) {
                System.out.println(i);
            }
        }
    }
}
