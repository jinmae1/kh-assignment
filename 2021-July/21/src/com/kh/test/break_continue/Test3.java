package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

    public static void test() {

        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number(over 2): ");

        do {
            num = sc.nextInt();

            if (num <= 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                System.out.print("Number(over 2): ");
                continue;

            } else
                break;

        } while (true);

        if (num % 2 == 0) {
            System.out.println("소수가 아니다.");
            return;
        }

        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                System.out.println("소수가 아니다.");
                return;
            }
        }
        System.out.println("소수다.");

    }
}
