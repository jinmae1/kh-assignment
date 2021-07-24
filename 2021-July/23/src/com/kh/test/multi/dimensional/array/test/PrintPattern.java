package com.kh.test.multi.dimensional.array.test;

public class PrintPattern {

	public static void main(String[] args) {

		int N = 5;

		new PrintPattern().pattern1(N);
		// new PrintPattern().pattern2(N);
		// new PrintPattern().pattern3(N);
		// new PrintPattern().pattern4(N);
		// new PrintPattern().pattern5(N);
		// new PrintPattern().pattern6(N);
		// new PrintPattern().pattern7(N);
		// new PrintPattern().pattern8(N);

	}

	public void pattern1(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i + 1; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

	public void pattern2(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}

	public void pattern3(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void pattern4(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void pattern5(int N) {

		for (int i = 1; i <= N; i += 2) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int j = 1; j <= N - i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void pattern6(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= 2 * Math.abs(i - (N / 2 + 1)); j++)
				System.out.print(" ");
			for (int j = 1; j <= -2 * Math.abs(i - (N / 2 + 1)) + N; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void pattern7(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= Math.abs(i - (N / 2 + 1)); j++)
				System.out.print(" ");
			for (int j = 1; j <= -2 * Math.abs(i - (N / 2 + 1)) + N; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public void pattern8(int N) {

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= -2 * Math.abs(i - (N / 2 + 1)) + N - 1; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * Math.abs(i - (N / 2 + 1)) + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
