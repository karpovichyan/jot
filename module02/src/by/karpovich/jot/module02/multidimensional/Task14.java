package by.karpovich.jot.module02.multidimensional;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] arr = initArray();
    }

    public static int[][] initArray() {
        int m = 1 + (int) (Math.random() * 10);
        int n = 1 + (int) (Math.random() * 10);
        int[][] arr = new int[m][n];
        System.out.println("matrix " + m + "x" + n + "\n");
        for (int i = 0; i < arr.length; i++) {
            if (m < n) {
                System.out.println("This matrix is undefined");
                break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (i <= j) {
                    arr[i][j] = 1;
                }
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
}
