package com.exception.charcheck;

public class CharacterProcess {

	public CharacterProcess() {
		super();
	}

	public int countAlpha(String s) throws CharCheckException {

		int count = 0;

		if (s.contains(" "))
			throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");

		for (int i = 0; i < s.length(); i++)
			if (Character.isAlphabetic(s.charAt(i)))
				count++;

		return count;
	}

}