package com.calc;

public class Calculator {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.printf("합: %d%n", num1 + num2);
        System.out.printf("차: %d%n", num1 - num2);
        System.out.printf("곱: %d%n", num1 * num2);
        if (num2 <= 0) {
            System.out.println("나누기: 0");
        } else {
            System.out.printf("나누기: %d%n", num1 / num2);
        }
    }
}
