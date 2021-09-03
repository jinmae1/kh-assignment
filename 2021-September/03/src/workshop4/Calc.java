package workshop4;

public class Calc {

	public int calculate(int num) {
		int evenSum = 0;
		for (int i = 2; i <= num; i += 2) {
			evenSum += i;
		}
		return evenSum;
	}

}