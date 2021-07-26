package array;

public class Test8 {

    public static void main(String[] args) {

        double sum = 0;
        double avg = 0;

        int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

        for (int[] arr : array) {
            for (int i : arr) {
                sum += i;
            }
        }
        avg = sum / (array.length * array[0].length);

        System.out.printf("합계: %.1f%n", sum);
        System.out.printf("평균: %.3f%n", avg);
    }
}
