package ncs.test6;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {

		int a;
		int b;

		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);

		System.out.print("Number 1:");
		a = sc.nextInt();
		if (1 <= a && a <= 9)
			return;

		System.out.print("Number 2:");
		b = sc.nextInt();
		if (1 <= b && b <= 9)
			return;

		System.out.println("합: " + calc.sum(a, b));
		System.out.println("차: " + calc.subtract(a, b));
		System.out.println("곱: " + calc.multiply(a, b));
		System.out.println("나누기: " + calc.divide(a, b));

	}
}
