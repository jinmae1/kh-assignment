package com.thread.alphabet;

public class AlphabetTest {

	public static void main(String[] args) {
		new UpperAlphabetThread().start();
		new LowerAlphabetThread().start();
	}
}