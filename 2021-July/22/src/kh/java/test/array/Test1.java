package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {

		new Test1().test();

	}

	public void test() {

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int each : arr) {
			System.out.println(each);
		}
	}
}
