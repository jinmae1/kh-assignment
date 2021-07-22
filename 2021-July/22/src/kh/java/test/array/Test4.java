package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		new Test4().test();

	}

	public void test() {

		String str = "";
		char[] mobile = new char[12];
		char[] hidden = new char[12];

		Scanner sc = new Scanner(System.in);
		System.out.print("Phone number: ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			mobile[i] = str.charAt(i);
		}

		for (int i = 0; i < mobile.length; i++) {
			if (3 <= i && i < 7) {
				hidden[i] = '*';
				continue;
			}
			hidden[i] = mobile[i];
		}

		for (char c : hidden) {
			System.out.print(c);
		}

		System.out.println();

	}
}
