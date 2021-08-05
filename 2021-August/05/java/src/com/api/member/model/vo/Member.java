package com.api.member.model.vo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Member {

	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private Calendar birth;

	public Member(String memberNo, String memberName, String height, String weight, String birth) {
		this.memberNo = Integer.parseInt(memberNo);
		this.memberName = memberName;
		this.height = Integer.parseInt(height);
		this.weight = Integer.parseInt(weight);

		int year = Integer.parseInt(birth.substring(0, 4));
		int month = Integer.parseInt(birth.substring(4, 6));
		int day = Integer.parseInt(birth.substring(6, 8));

		this.birth = new GregorianCalendar(year, month - 1, day);
	}

	public String information() {
		return String.format("%d. %s  %dcm  %dkg  %d.%d.%d", memberNo, memberName, height, weight,
				birth.get(Calendar.YEAR), birth.get(Calendar.MONTH) + 1, birth.get(Calendar.DAY_OF_MONTH));
	}

}