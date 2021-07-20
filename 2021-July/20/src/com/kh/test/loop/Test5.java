package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

    public void test() {

        int num = 0;
        String name = "";
        int age = 0;
        String addr = "";
        float height = 0;
        float weight = 0;
        String contact = "";

        float totalAge = 0;
        float totalHeight = 0;
        float totalWeight = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("회원의 수를 입력하세요: ");
        num = sc.nextInt();

        System.out.println("============= 저장회원 ==============");

        for (int i = 0; i < num; i++) {
            System.out.print("이름: ");
            name = sc.next();

            System.out.print("나이: ");
            age = sc.nextInt();

            sc.nextLine();
            System.out.print("주소: ");
            addr = sc.nextLine();

            System.out.print("신장: ");
            height = sc.nextFloat();

            System.out.print("체중: ");
            weight = sc.nextFloat();

            System.out.print("연락처: ");
            contact = sc.next();

            System.out.printf("%d %s  %d세  %s  1%.1fcm  %.1fkg  %s%n", i + 1, name, age, addr, height, weight, contact);

            totalAge += age;
            totalHeight += height;
            totalWeight += weight;
        }

        System.out.println("===================================");
        System.out.printf("평균 나이: %.1f세 / 평균 신장: %.1fcm / 평균 체중: %.1fkg%n", totalAge / num, totalHeight / num,
                totalWeight / num);

    }

}
