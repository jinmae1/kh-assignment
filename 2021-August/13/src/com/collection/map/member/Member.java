package com.collection.map.member;

import java.util.*;

public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private String phoneNumber;

	// private Map<String, MemberTest> map = new HashMap<>();

	public Member() {

	}

	public Member(String userId, String userPwd, String userName, int age, String phoneNumber) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	// public Member(String userId, String userPwd, String userName, int age, String
	// phoneNumber,
	// Map<String, MemberTest> map) {
	// this();
	// this.map = map;
	// }

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d\t%s", userId, userPwd, userName, age, phoneNumber);
	}

}