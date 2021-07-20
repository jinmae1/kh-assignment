package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

    public void test() {

        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                System.out.print("박");
            else
                System.out.print("수");
        }
        System.out.println();

    }
}
