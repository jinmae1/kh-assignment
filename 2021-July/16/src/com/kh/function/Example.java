package com.kh.function;

import java.util.Scanner;

public class Example {

    Scanner sc = new Scanner(System.in);

    public void opSample1() {

        int korean = 0;
        int english = 0;
        int math = 0;
        int total = 0;
        float average = 0f;

        String pf = "";

        System.out.print("Korean: ");
        korean = sc.nextInt();

        System.out.print("English: ");
        english = sc.nextInt();

        System.out.print("Math: ");
        math = sc.nextInt();

        total = korean + english + math;
        average = (float) (total / 3.0);

        pf = (average >= 60) && (korean >= 40) && (english >= 40) && (math >= 40) ? "합격" : "불합격";

        System.out.println(pf);

    }

    public void opSample2() {

        String name = "";
        int year = 0;
        int classNo = 0;
        int idNo = 0;
        char mf = ' ';
        String gender = "";
        float grade = 0f;

        System.out.print("Name: ");
        name = sc.next();

        System.out.print("Year: ");
        year = sc.nextInt();

        System.out.print("Class Number: ");
        classNo = sc.nextInt();

        System.out.print("ID : ");
        idNo = sc.nextInt();

        System.out.print("Gender(M/F): ");
        gender = sc.next();
        mf = gender.charAt(0) == 'M' ? '남' : '여';

        System.out.print("Grade : ");
        grade = sc.nextFloat();

        System.out.printf("%d학년 %d반 %d번 %s학생 %s은(는) 성적이 %.2f이다.%n", year, classNo, idNo, mf, name, grade);

    }

    public void opSample3() {

        String positive = "양수";
        int num = 0;

        System.out.print("Number: ");
        num = sc.nextInt();
        positive += num > 0 ? "다." : "가 아니다.";

        System.out.println(positive);

    }

    public void opSample4() {

        int num = 0;
        String even = "";

        System.out.print("Number: ");
        num = sc.nextInt();

        even = num % 2 == 0 ? "짝수다" : "홀수다";

        System.out.println(even);

    }
}
