package com.thread.sleep;

import java.util.Random;

public class SleepTest implements Runnable {

	private static final long MILLIS = 3000;
	private static final String[] APHORISM = {

			"Doe, a dear, a female dear", "Ray, a drop of golden sun", "Me, a name I call myself",
			"Far, a long, long way to run", "Sew, a needle pulling thread", "La, a note to follow Sew",
			"Tea, a drink with jam and bread", "That will bring us back to Do (oh-oh-oh",
			"Do-rem-mi-fa-so-la-ti-do So-Do!", "Do re mi do mi do mi"

	};

	public static void main(String[] args) {

		Runnable st = new SleepTest();
		Thread th = new Thread(st);
		((SleepTest) st).sendAphorism();

		th.start();
	}

	public void sendAphorism() {
		// ?
	}

	@Override
	public void run() {
		Random rand = new Random();
		for (int i = 0; i < APHORISM.length; i++) {
			try {
				System.out.println(i + 1 + ": " + APHORISM[rand.nextInt(10)]);
				Thread.sleep(MILLIS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}