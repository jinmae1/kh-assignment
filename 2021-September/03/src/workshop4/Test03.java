package workshop4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Integer[] wrapArr = new Integer[10];

		int i = 0;
		for (Integer val : arr) {
			wrapArr[i++] = val;
		}

		List<Integer> sorted = Arrays.asList(wrapArr);
		Collections.sort(sorted, Collections.reverseOrder());
		System.out.println(sorted);

	}
}