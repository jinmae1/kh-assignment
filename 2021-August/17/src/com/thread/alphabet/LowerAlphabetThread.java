package com.thread.alphabet;

public class LowerAlphabetThread extends Thread {

	@Override
	public void run() {
		for (char i = 'a'; i <= 'z'; i++)
			System.err.print(i + " ");
	}
}