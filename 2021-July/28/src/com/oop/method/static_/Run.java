package com.oop.method.static_;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        String str = "";
        String newStr = "";
        String tail = "";
        int count = 0;
        int idx = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Word or phrase: ");
        str = sc.nextLine();

        newStr = StaticMethod.toUpperCase(str);
        System.out.println("============================");
        System.out.println("Capitalize: " + newStr);
        System.out.println("============================");

        System.out.print("Index to replace: ");
        idx = sc.nextInt();
        newStr = StaticMethod.setChar(str, idx, '*');
        System.out.println("============================");
        System.out.println("Replace: " + newStr);

        count = StaticMethod.getAlphabetLength(str);
        System.out.println("============================");
        System.out.println("Alphabet length: " + count);

        System.out.println("============================");
        System.out.print("Word to concat: ");
        sc.nextLine();
        tail = sc.nextLine();
        newStr = StaticMethod.concat(str, tail);
        System.out.println("============================");
        System.out.println("Concat: " + newStr);
        System.out.println("============================");

        // System.out.println(StaticMethod.getAlphabetLength(str));

    }

}
