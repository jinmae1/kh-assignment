package com.collection.map.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberTest {

	private Map<String, Member> map;
	// private Member[] member;

	public MemberTest() {
		Member[] member = new Member[5];

		member[0] = new Member("honggd", "1234", "홍길동", 35, "010-1234-1234");
		member[1] = new Member("sinsa", "8888", "사임당", 50, "010-8888-8888");
		member[2] = new Member("leess", "1111", "이순신", 43, "010-1111-1111");
		member[3] = new Member("yooon", "4321", "윤봉길", 37, "010-4321-4321");
		member[4] = new Member("jangbg", "0000", "장보고", 29, "010-0000-0000");
		map = new HashMap<>();

		for (Member m : member)
			map.put(m.getUserId(), m);

	}

	public static void main(String[] args) {
		MemberTest test = new MemberTest();
		test.test1();
		// test.test2();
		// test.test3();
		// test.test4();

	}

	private void test1() {
		print();
	}

	private void test2() {
		String[] userId = { "jangbg", "sejong" };
		String does = "does";
		for (String id : userId) {
			if (!userExists(id)) {
				does += "n't";
			}
			System.out.println("User " + id + " " + does + " exist.");

		}
	}

	private boolean userExists(String userId) {
		if (map.containsKey(userId))
			return true;
		else
			return false;

	}

	private void test3() {
		String id = "yooon";
		Member deleted = null;
		if (map.containsKey(id))
			deleted = map.put(id, new Member(id, "5678", "윤동주", 27, "010-3456-3456"));

		print();
		System.out.println("회원 변경:\n" + deleted);
	}

	private void test4() {
		String id = "sinsa";
		Member deleted = null;
		deleted = map.remove(id);

		print();
		System.out.println("회원 삭제:\n" + deleted);
	}

	private void print() {
		Set<String> keySet = map.keySet();
		System.out.println("==============================================");
		System.out.printf("%s\t%s\t%s\t%s\t%s%n", "아이디", "비번", "이름", "나이", "전화번호");
		System.out.println("----------------------------------------------");
		for (String key : keySet)
			System.out.println(map.get(key));

		System.out.println("----------------------------------------------");

	}
}