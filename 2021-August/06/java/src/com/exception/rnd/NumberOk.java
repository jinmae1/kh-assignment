package com.exception.rnd;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberOk {

	private int randNum;
	private static int tries;

	public static void main(String[] args) {

		int userInput;
		int retVal;

		NumberOk nok = new NumberOk();

		nok.startGame();

		while (true) {

			try {

				System.out.print("정수 입력: ");
				userInput = nok.getNumber();
				retVal = nok.checkNumber(userInput);

				if (retVal == 1)
					System.out.println("입력한 정수보다 작습니다." + "(" + tries + "회)");
				else if (retVal == -1)
					System.out.println("입력한 정수보다 큽니다." + "(" + tries + "회)");
				else if (retVal == 0) {
					System.out.println(tries + "회 만에 맞혔습니다.");

					if (nok.doContinue()) {
						nok.startGame();
						continue;
					} else
						break;
				}
				tries++;
				continue;

			} catch (InputMismatchException ime) {
				continue;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		return;
	}

	public int getNumber() throws InputMismatchException {
		int num = 0;
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

		return num > this.randNum ? 1 : -1;
	}

	private boolean doContinue() {
		String answer;
		char y = 'n';
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("계속 하시겠습니까?(y/n): ");
			answer = sc.next();

			if (answer.length() == 1) {
				y = answer.charAt(0);

				if ((y == 'y') || (y == 'Y'))
					return true;
				else if ((y == 'n') || (y == 'N'))
					return false;
			}
			System.err.println("(y 혹은 n만 입력하세요)");
			continue;
		}
	}

	public void startGame() {
		Random rand = new Random();
		this.randNum = rand.nextInt(100) + 1;
		tries = 1;
		System.out.println("\n==== 새 게임 시작 ====");
		System.out.println("임의의 정수 발생");
	}
}