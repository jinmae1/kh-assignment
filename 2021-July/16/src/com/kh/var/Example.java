package com.kh.var;

import java.util.Scanner;

public class Example {

    Scanner sc = new Scanner(System.in);

    public void example1() {

        int a = 0;
        int b = 0;

        System.out.print("Number a: ");
        a = sc.nextInt();

        System.out.print("Number b: ");
        b = sc.nextInt();

        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("a / b = %d%n", a / b);
        System.out.printf("a %% b = %d%n", a % b);

    }

    public void example2() {

        float width = 0;
        float height = 0;

        System.out.print("Width: ");
        width = sc.nextFloat();

        System.out.print("Height: ");
        height = sc.nextFloat();

        System.out.printf("Area: %f%n", width * height);
        System.out.printf("Permiter: %f%n", (width + height) * 2);

    }

    public void example3() {

        String word = "";

        System.out.print("Word: ");
        word = sc.next();

        System.out.printf("First letter: %s", word.charAt(0));
        System.out.printf("Second letter: %s", word.charAt(1));
        System.out.printf("Third letter: %s", word.charAt(2));

    }
}
