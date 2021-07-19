package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

    public void test() {

        int a = 0;
        int b = 0;
        char operator = ' ';
        float result = 0f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number a: ");
        a = sc.nextInt();

        System.out.print("Number b: ");
        b = sc.nextInt();

        System.out.print("Operator(+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else {
            System.out.println("Error, abort.");
            return;
        }

        System.out.printf("Input: %d, %d, %s%n", a, b, operator);

        System.out.printf("%d %s %d = %.2f%n", a, operator, b, result);

    }
}
