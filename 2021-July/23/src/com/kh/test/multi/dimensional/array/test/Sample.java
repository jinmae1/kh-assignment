package com.kh.test.multi.dimensional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {

		new Sample().exercise1();
		// new Sample().exercise2();
		// new Sample().exercise3();
	}

	public void exercise1() {

		Random rand = new Random();
		int[][] arr = new int[3][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100) + 1;
				if (arr[i][j] % 5 == 0)
					System.out.printf("%d (%d, %d)%n", arr[i][j], i, j);
			}
		}
	}

	public void exercise2() {

		Random rand = new Random();
		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = rand.nextInt(100) + 1;
				arr[i][arr[i].length - 1] += arr[i][j];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}
	}

	public void exercise3() {
		Random rand = new Random();
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = rand.nextInt(100) + 1;
				arr[i][arr[i].length - 1] += arr[i][j];
				arr[arr.length - 1][j] += arr[i][j];
			}
			arr[arr.length - 1][arr[i].length - 1] += arr[i][arr[i].length - 1];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
