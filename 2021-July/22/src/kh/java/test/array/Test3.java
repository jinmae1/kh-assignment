package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		new Test3().test();

	}

	public void test() {

		Scanner sc = new Scanner(System.in);
		String str = "";
		char[] chrStr;
		char search = ' ';
		int match = 0;

		System.out.print("Word: ");
		str = sc.nextLine();

		chrStr = new char[str.length()];
		for (int i = 0; i < chrStr.length; i++) {
			chrStr[i] = str.charAt(i);
		}

		System.out.print("Letter to find: ");
		search = sc.next().charAt(0);

		for (char c : chrStr) {
			if (c == search) {
				match++;
			}
		}
		System.out.println("검색값: " + search);

		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %s은(는) %d개 입니다.%n", str, search, match);

	}
}
