package workshop4;

public class Test05 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		if (1 <= num && num <= 5) {
			for (int i = num; i <= 10; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					continue;
				}
				System.out.print(i);
				if (i != 8)
					System.out.print('+');
				sum += i;
			}
			System.out.println("\n결과: " + sum);
		} else
			System.out.println("1 ~ 5 사이의 정수를 입력해주세요");

	}
}