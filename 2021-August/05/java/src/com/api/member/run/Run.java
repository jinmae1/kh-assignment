package com.api.member.run;

import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

/**
 * Run
 */
public class Run {

	public static void main(String[] args) {

		String csv = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		StringTokenizer st = new StringTokenizer(csv, "[,|]");

		final int FIELDS = 5;
		final int MEMBERS = st.countTokens() / FIELDS;

		String[][] tokens = new String[MEMBERS][FIELDS];
		Member[] members = new Member[MEMBERS];

		for (int i = 0; i < tokens.length; i++) {
			for (int j = 0; j < tokens[i].length; j++) {
				tokens[i][j] = st.nextToken();
			}
		}

		for (int i = 0; i < tokens.length; i++) {
			members[i] = new Member(tokens[i][0], tokens[i][1], tokens[i][2], tokens[i][3], tokens[i][4]);
			System.out.println(members[i].information());

		}
	}
}