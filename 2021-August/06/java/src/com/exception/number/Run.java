package com.exception.number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run run = new Run();
		run.test();
	}

	public void test() {

		int a = 0;
		int b = 0;
		boolean isDouble = false;

		NumberProcess np = new NumberProcess();
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				System.out.print("Num1: ");
				a = sc.nextInt();
				System.out.print("Num2: ");
				b = sc.nextInt();

				isDouble = np.checkDouble(a, b);
				if (isDouble)
					System.out.printf("%d는 %d의 배수입니다.%n", a, b);
				else
					System.out.printf("%d는 %d의 배수가 아닙니다.%n", a, b);

			} catch (NumberRangeException nre) {
				System.err.println(nre.getMessage());
				sc.nextLine();
				continue;

			} catch (InputMismatchException ime) {
				ime.printStackTrace();
				sc.nextLine();
				continue;

			} catch (ArithmeticException ae) {
				ae.printStackTrace();
				sc.nextLine();
				continue;

			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
				continue;
			}
			break;
		}

	}
}