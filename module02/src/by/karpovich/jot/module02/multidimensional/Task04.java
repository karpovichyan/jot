package by.karpovich.jot.module02.multidimensional;

/*
4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    | 1  2   3  ... n |
    | n n-1 n-2 ... 1 |
    | 1  2   3  ... n |
    | n n-1 n-2 ... 1 |
    | .  .   .  .   . |
    | .  .   .   .  . |
    | .  .   .    . . |
    | n n-1 n-2 ... 1 |
 */

public class Task04 {
    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0) {
                    sum += 1;
                    arr[i][j] = sum;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = arr.length + 1;
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 != 0) {
                    sum -= 1;
                    arr[i][j] = sum;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
