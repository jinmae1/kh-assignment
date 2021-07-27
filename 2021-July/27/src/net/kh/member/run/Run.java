package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();

		member.setMemberId("jd9999");
		member.setMemberPwd("1234");
		member.setMemberName("John Doe");
		member.setAge(20);
		member.setGender('M');
		member.setPhone("000-1234-5678");
		member.setEmail("jd9999@email.com");

		System.out.println("ID: " + member.getMemberId());
		System.out.println("Password: " + member.getMemberPwd());
		System.out.println("Name: " + member.getMemberName());
		System.out.println("Age: " + member.getAge());
		System.out.println("Gender: " + member.getGender());
		System.out.println("Phone: " + member.getPhone());
		System.out.println("Email: " + member.getEmail());
	}
}
