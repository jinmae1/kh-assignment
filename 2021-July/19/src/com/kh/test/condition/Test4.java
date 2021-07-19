package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

    public void test() {

        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        num = sc.nextInt();

        if (1 <= num && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("Even.");
            } else if (num % 2 != 0) {
                System.out.println("Odd.");
            }
        } else {
            System.out.println("The number must be between 1 ~ 10.");
        }

    }
}
