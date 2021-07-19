package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

    public void test() {

        float height = 0;
        float weight = 0;
        float bmi = 0;
        String result = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Height: ");
        height = sc.nextFloat();

        if (height > 2) {
            height /= 100;
        }

        System.out.print("Weight: ");
        weight = sc.nextFloat();

        bmi = weight / (height * height);

        if (bmi < 18.5) {
            result = "저체중";
        } else if (18.5 <= bmi && bmi <= 23) {
            result = "정상체중";
        } else if (23 <= bmi && bmi <= 25) {
            result = "과체중";
        } else if (25 <= bmi && bmi <= 30) {
            result = "비만";
        } else if (30 <= bmi)
            result = "고도비만";

        System.out.println(result + "입니다.");
    }
}
