package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

    public void test() {

        String str = "";
        char search = ' ';
        int match = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("단어를 입력하세요: ");
        str = sc.next();

        System.out.print("검색할 문자를 입력하세요: ");
        search = sc.next().charAt(0);
        if (!(('A' <= search && search <= 'Z') || ('a' <= search && search <= 'z'))) {
            System.err.println("영문자가 아닙니다.");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search)
                match++;
        }

        System.out.println();
        System.out.println("문자열 입력: " + str);
        System.out.println("검색할 문자 입력: " + search);
        System.out.printf("'%s'가 포함된 갯수: %d%n", search, match);

    }
}
