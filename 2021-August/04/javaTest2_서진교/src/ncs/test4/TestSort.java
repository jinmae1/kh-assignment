package ncs.test4;

import java.util.Arrays;

public class TestSort {
	public static void main(String[] args) {

		int[] rand = new int[10];

		for (int i = 0; i < 10; i++) {
			rand[i] = (int) (Math.random() * 50 + 51);
		}
		System.out.println("Before: " + Arrays.toString(rand));

		int temp;
		for (int i = 0; i < rand.length; i++) {
			for (int j = i + 1; j < rand.length; j++) {
				if (rand[i] < rand[j]) {
					temp = rand[i];
					rand[i] = rand[j];
					rand[j] = temp;
				}
			}
		}
		System.out.println("After: " + Arrays.toString(rand));

	}
}
