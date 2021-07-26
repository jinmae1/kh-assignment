package test.controller;

public class Test2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j % 2 == 1) {
                    System.out.printf("%d * %d = %d%n", i, j, i * j);
                }
            }
            System.out.println();
        }
    }
}
