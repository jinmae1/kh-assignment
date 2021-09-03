package workshop4;

public class Test04 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		if (5 <= num && num <= 10) {
			System.out.print("짝수: ");
			for (int i = 2; i <= num; i += 2) {
				System.out.print(i + " ");
			}
			sum = new Calc().calculate(num);
			System.out.println("\n결과: " + sum);
		} else
			System.out.println("5 ~ 10 사이의 정수를 입력해주세요");
	}
}