package ncs.test3;

import java.util.Arrays;

public class TvTest {

	public static void main(String[] args) {

		final int NUM_TV = 3;
		Tv tvArray[] = new Tv[NUM_TV];

		tvArray[0] = new Tv("INFINIA", 1_500_000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1_000_000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2_000_000, "3D TV");

		for (Tv tv : tvArray) {
			System.out.println(tv);
		}
		System.out.println();

		Arrays.sort(tvArray);

		System.out.println("가격이 가장 비싸안 제품: " + tvArray[NUM_TV - 1].getName());
		System.out.println("가격이 가장 저렴한 제품: " + tvArray[0].getName());

	}
}
