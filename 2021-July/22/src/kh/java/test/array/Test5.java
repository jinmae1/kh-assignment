package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		new Test5().test();

	}

	public void test() {

		String str = "";
		char[] id = new char[14];
		char[] hidden = new char[14];

		Arrays.fill(hidden, '*');

		Scanner sc = new Scanner(System.in);
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			id[i] = str.charAt(i);
		}

		System.arraycopy(id, 0, hidden, 0, 8);

		for (char c : hidden) {
			System.out.print(c);
		}
		System.out.println();

	}
}
