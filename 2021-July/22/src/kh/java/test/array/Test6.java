package kh.java.test.array;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		new Test6().test();

	}

	public void test() {

		int[] odd;
		Scanner sc = new Scanner(System.in);

		System.out.print("Number: ");

		odd = new int[sc.nextInt()];

		for (int i = 0; i < odd.length / 2 + 1; i++) {
			odd[i] = i + 1;
			odd[odd.length - i - 1] = i + 1;
		}

		System.out.print("[");
		for (int i = 0; i < odd.length; i++) {

			System.out.print(odd[i]);
			if (i != odd.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}
}
