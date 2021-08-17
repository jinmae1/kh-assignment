package com.thread.alphabet;

public class UpperAlphabetThread extends Thread {

	@Override
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++)
			System.out.print(i + " ");
	}
}