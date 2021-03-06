package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

    public static void test1() {

        int num = 0;
        int mul = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i += 2) {
            mul *= i;
        }

        System.out.println("Mul: " + mul);

    }

    public static void test2() {

        int a = 0;
        int b = 0;
        int big = 0;
        int small = 0;
        int oddSum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number a: ");
        a = sc.nextInt();

        System.out.print("Number b: ");
        b = sc.nextInt();

        small = a <= b ? a : b;
        big = b < a ? a : b;

        int i = small % 2 == 0 ? small + 1 : small;
        for (; i <= big; i += 2) {
            oddSum += i;
        }
        System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다.%n", small, big, oddSum);

    }
}
