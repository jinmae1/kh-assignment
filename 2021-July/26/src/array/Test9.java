package array;

public class Test9 {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = 0;

        int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

        for (int[] arr : array)
            for (int i : arr) {
                min = i < min ? i : min;
                max = i > max ? i : max;
            }

        System.out.println("가장 큰 값: " + max);
        System.out.println("가장 작은 값: " + min);
    }
}
