package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		Run run = new Run();
		run.test1();

	}

	public void test1() {

		CharacterProcess cp = new CharacterProcess();
		Scanner sc = new Scanner(System.in);
		String str = null;
		int count = 0;

		while (true) {

			try {
				System.out.print("입력: ");
				str = sc.nextLine();
				count = cp.countAlpha(str);
				System.out.println(count + "개 입니다.");

			} catch (CharCheckException cce) {
				System.err.println(cce.getMessage());
				continue;

			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			break;
		}

	}
}