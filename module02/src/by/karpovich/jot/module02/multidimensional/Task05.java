package by.karpovich.jot.module02.multidimensional;

/*
5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    | 1  1  1  ... 1 1 1 |
    | 2  2  2  ... 2 2 0 |
    | 3  3  3  ... 3 0 0 |
    | .  .   .  .   .    |
    | .  .   .   .  .    |
    | .  .   .    . .    |
    | n-1 n-1 0 ... 0 0 0|
    |  n  0   0 ... 0 0 0|
*/
public class Task05 {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i + 1;
                if (i + j >= arr.length) {
                    arr[i][j] = 0;
                }
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
