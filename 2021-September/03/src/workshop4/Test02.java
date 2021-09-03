package workshop4;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;

		for (int i = 0; i < arr3.length; i++) {
			sum += arr3[i] = new Random().nextInt(10) + 1;
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		System.out.println("sum: " + sum);
		System.out.println("avg: " + (float) sum / arr3.length);

	}
}