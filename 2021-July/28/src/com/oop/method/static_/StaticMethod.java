package com.oop.method.static_;

/**
 * StaticMethod
 */
public class StaticMethod {

    public static String toUpperCase(String str) {

        // return str.toUpperCase();

        char[] upper = new char[str.length()];

        for (int i = 0; i < upper.length; i++)
            upper[i] = Character.toUpperCase(str.charAt(i));
        return String.valueOf(upper);
    }

    public static String setChar(String str, int idx, char ch) {

        char[] temp = str.toCharArray();
        if (0 <= idx && idx < temp.length)
            temp[idx] = ch;
        else
            return "ERROR!";

        return String.valueOf(temp);
    }

    public static int getAlphabetLength(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++)
            if (Character.isAlphabetic(str.charAt(i)))
                count++;

        return count;
    }

    public static String concat(String head, String tail) {

        return head + tail;
    }

}