package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

    public void test() {

        int num = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            sum += i++;
        }
        System.out.println(sum);
    }
}
