package com.exception.rnd;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {

	private int randNum;
	private int tries;

	public static void main(String[] args) {

		int userInput;
		int result;

		NumberOk nok = new NumberOk();
		nok.startGame();

		while (true) {

			try {
				System.out.print("정수 입력: ");
				userInput = nok.getNumber();
				result = nok.checkNumber(userInput);

				if (result == 1)
					System.out.println("입력한 정수보다 작습니다." + "(" + nok.tries + "회)");
				else if (result == -1)
					System.out.println("입력한 정수보다 큽니다." + "(" + nok.tries + "회)");
				else if (result == 0) {
					System.out.println(nok.tries + "회 만에 맞혔습니다.");

					if (nok.shouldContinue()) {
						nok.startGame();
						continue;
					} else
						break;
				}
				nok.tries++;
				continue;

			} catch (InputMismatchException ime) {
				continue;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		return;
	}

	public int getNumber() throws InputMismatchException {
		int num;
		Scanner sc = new Scanner(System.in);

		try {
			num = sc.nextInt();
			return num;

		} catch (InputMismatchException ime) {
			System.err.println("(숫자만 입력하세요)");
			sc.nextLine();
			throw ime;
		}
	}

	public int checkNumber(int num) {
		if (this.randNum == num)
			return 0;
		else
			return this.randNum < num ? 1 : -1;
	}

	private boolean shouldContinue() {
		char y_n;
		String input;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("계속 하시겠습니까?(y/n): ");
			input = sc.next();

			if (input.length() == 1) {
				y_n = input.charAt(0);

				if ((y_n == 'y') || (y_n == 'Y'))
					return true;
				else if ((y_n == 'n') || (y_n == 'N'))
					return false;
			}
			System.err.println("(y 혹은 n만 입력하세요)");
			continue;
		}
	}

	public void startGame() {
		this.randNum = new Random().nextInt(100) + 1;
		this.tries = 1;

		System.out.println("\n==== 새 게임 시작 ====");
		System.out.println("임의의 정수 발생");
	}
}