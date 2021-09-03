package workshop4;

public class Test01 {
	public static void main(String[] args) {
		int[][] arr2 = { { 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30, 30 } };
		int total = 0;
		int count = 0;

		for (int[] i : arr2) {
			for (int j : i) {
				System.out.print(j + " ");
				total += j;
				count++;
			}
			System.out.println();
		}

		System.out.println("total: " + total);
		System.out.println("total: " + Math.round(((float) total / count) * 10) / 10.0);
	}

}