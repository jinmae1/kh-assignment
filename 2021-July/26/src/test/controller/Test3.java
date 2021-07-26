package test.controller;

public class Test3 {
    public static void main(String[] args) {

        int num = 1;
        double sum = 0;
        int hundred = 100;

        while (num <= hundred) {
            sum += num++;
        }

        System.out.printf("합계: %.0f%n", sum);
        System.out.printf("평균: %.1f%n", sum / hundred);

    }
}
