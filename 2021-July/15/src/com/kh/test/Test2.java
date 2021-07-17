package com.kh.test;

public class Test2 {
	public static void main(String[] args) {

		String name = "홍길동";
		byte age = 22;
		char gender = '남';
		String mobile = "01012341234";
		String email = "hgd@naver.com";
		String address = "경기도 광주시";
		String separator = "=======================================================================";

		System.out.printf("%s%n", separator);
		System.out.printf("%-8s%-6s%-6s%-16s%-16s%-16s%n", "이름", "나이", "성별", "전화번호", "이메일", "주소");
		System.out.printf("%s%n", separator);

		System.out.printf("%-8s%-6d%-6s%-16s%-16s%-16s%n", name, age, gender, mobile, email, address);

		name = "홍길순";
		age = 20;
		gender = '여';
		mobile = "010123412341";
		email = "hgs@gmail.com";
		address = "전라남도 광주시";

		System.out.printf("%-8s%-6d%-6s%-16s%-16s%-16s%n", name, age, gender, mobile, email, address);

	}
}