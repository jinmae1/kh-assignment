package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

    public static void test() {
        int randNum = 0;
        int userNum = 0;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        randNum = rand.nextInt(100) + 1;

        int i = 1;
        while (true) {
            System.out.print("Number: ");
            userNum = sc.nextInt();

            if (userNum > randNum) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else if (userNum < randNum) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else {
                System.out.println("정답입니다. " + i + "회 만에 정답을 맞추셨습니다.");
                break;
            }
            i++;
        }
    }
}
