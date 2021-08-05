package ncs.test5;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {

		double[][] students = new double[3][5];
		double[] scores;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {

			scores = students[i];
			System.out.print("Student " + i + ": ");

			for (int j = 0; j < students[i].length - 2; j++) {
				scores[j] = sc.nextDouble();
				scores[students[i].length - 2] += scores[j];
				// Total
			}

			scores[students[i].length - 1] = scores[students[i].length - 2] / (scores.length - 2);
			// Average
		}

		System.out.println("Index\t과목1\t과목2\t과목3\t총점\t평균");

		int i = 0;
		for (double[] student : students) {

			System.out.print(i);
			for (double score : student) {
				System.out.printf("\t%.1f", score);
			}

			System.out.println();
			i++;
		}
	}
}