package ncs.test1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		double[] grade = new double[5]; // { A, B, C, D, E}
		String[] input;
		String _class;
		double eval = 0.0;

		Scanner sc = new Scanner(System.in);

		System.out.println("A B C D E: ");
		input = sc.nextLine().split(" ");

		if (input.length != 5) {
			System.out.println("다시 입력 하세요");
			return;
		}

		for (int i = 0; i < grade.length; i++) {

			grade[i] = Double.parseDouble(input[i]);

			if (10 <= grade[i] && grade[i] <= 99) {
				if (grade[i] != (int) grade[i]) {
					System.out.println("다시 입력 하세요");
					return;
				}
			} else {
				System.out.println("다시 입력하세요");
				return;
			}
		}

		eval += ((grade[0] + grade[1]) / 2) * 0.6f;
		eval += ((grade[2] + grade[3]) / 2) * 0.2f;
		eval += grade[4] * 0.2f;

		switch ((int) eval / 10) {
			case 9:
				_class = "Gold";
				break;
			case 8:
				_class = "Silver";
				break;
			case 7:
				_class = "Bronze";
				break;
			default:
				_class = "Normal";
				break;
		}

		System.out.printf("평가점수: %.1f%n", eval);
		System.out.printf("Class: %s Class%n", _class);

	}

}