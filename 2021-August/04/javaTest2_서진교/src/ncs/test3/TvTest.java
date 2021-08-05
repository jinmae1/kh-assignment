package ncs.test3;

public class TvTest {

	public static void main(String[] args) {

		Tv tvArray[] = new Tv[3];

		tvArray[0] = new Tv("INFINIA", 1_500_000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1_000_000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2_000_000, "3D TV");

		for (Tv tv : tvArray) {
			System.out.println(tv);
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (Tv tv : tvArray) {
			min = tv.getPrice() < min ? tv.getPrice() : min;
			max = tv.getPrice() > max ? tv.getPrice() : max;
		}
		System.out.println();

		Tv temp;
		for (int i = 0; i < tvArray.length; i++) {
			for (int j = i + 1; j < tvArray.length; j++) {
				if (tvArray[i].getPrice() < tvArray[j].getPrice()) {
					temp = tvArray[i];
					tvArray[i] = tvArray[j];
					tvArray[j] = temp;
				}
			}
		}
		temp = null;

		for (Tv tv : tvArray) {
			if (max == tv.getPrice())
				System.out.println("가격이 가장 비싼 제품: " + tv.getName());
			if (min == tv.getPrice())
				System.out.println("가격이 가장 저렴한 제품: " + tv.getName());
		}
	}
}
