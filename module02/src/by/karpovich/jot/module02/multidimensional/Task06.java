package by.karpovich.jot.module02.multidimensional;

/*
6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    | 1  1  1 ... 1  1  1 |
    | 0  1  1 ... 1  1  0 |
    | 0  0  1 ... 1  0  0 |
    | .  .  .  .  .  .  . |
    | .  .  .   . .  .  . |
    | .  .  .    ..  .  . |
    | 0  1  1 ... 1  1  0 |
    | 1  1  1 ... 1  1  1 |
 */

public class Task06 {
    public static void main(String[] args) {
        int[][] arr = initArray(10);
        printArray(arr);
    }

    public static int[][] initArray(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - 1 - i][j] = 1;
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

