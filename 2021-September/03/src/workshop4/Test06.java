package workshop4;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		try {
			if (args.length != 2)
				throw new Exception();

			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);

			if (!(1 <= num1 && num1 <= 5) || !(1 <= num2 && num2 <= 5)) {
				throw new ArrayIndexOutOfBoundsException();
			}

			int[][] arr = new int[num1][num2];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = new Random().nextInt(5) + 1;
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
				}
				System.out.println();
			}

			System.out.println("\nsum: " + sum);
			System.out.println("avg: " + (float) sum / (num1 * num2));

		} catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			System.out.println("숫자를 확인하세요");
		} catch (Exception e) {
			System.out.println("다시 입력하세요");
		}

	}
}