package com.api.member.run;

import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		String csv = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		StringTokenizer memTokenizer = new StringTokenizer(csv, "|");
		StringTokenizer fieldTokenizer;

		final int FIELDS = 5;
		final int MEMBERS = memTokenizer.countTokens();

		String[][] tokens = new String[MEMBERS][FIELDS];
		Member[] members = new Member[MEMBERS];

		for (int i = 0; i < MEMBERS; i++) {
			fieldTokenizer = new StringTokenizer(memTokenizer.nextToken(), ",");
			for (int j = 0; j < FIELDS; j++) {
				tokens[i][j] = fieldTokenizer.nextToken();
			}
		}

		for (int i = 0; i < tokens.length; i++) {
			members[i] = new Member(tokens[i][0], tokens[i][1], tokens[i][2], tokens[i][3], tokens[i][4]);
			System.out.println(members[i].information());
		}

	}
}