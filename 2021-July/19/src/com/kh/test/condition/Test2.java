package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

    public void test() {

        int korean = 0;
        int english = 0;
        int math = 0;
        int total = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Korean: ");
        korean = sc.nextInt();

        System.out.print("English: ");
        english = sc.nextInt();

        System.out.print("Math: ");
        math = sc.nextInt();

        total = korean + english + math;
        average = (double) (total / 3.0);

        if (average >= 60) {
            if (korean >= 40 && english >= 40 && math >= 40) {
                System.out.println("Pass.");
            }

        } else {
            System.out.println("Fail.");
        }
    }
}
