package array;

public class Test10 {
    public static void main(String[] args) {

        int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
        int[] copyAr = new int[array.length * array[0].length];
        boolean contains = false;

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {
                    contains = false;

                    for (int arr : copyAr) {
                        if (arr == array[i][j]) {
                            contains = true;
                            break;
                        }
                    }
                    if (!contains) {
                        copyAr[i * array.length + j] = array[i][j];
                        // 원본 배열의 인덱스 정보를 유지하고 싶은 경우

                        // copyAr[k++] = array[i][j];
                        // copyAr에 순차적으로 값을 대입하고 싶은 경우
                    }
                }
            }
        }

        System.out.print("copyAr: ");
        for (int i : copyAr) {
            if (i != 0)
                System.out.print(i + "  ");
        }
        System.out.println();
    }
}
