package array;

public class Test7 {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double sum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("합계: %.1f%n", sum);
    }
}
