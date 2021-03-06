package by.karpovich.jot.module02.multidimensional;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{-1, 3, 0, 0, 2}, {8, 3, 0, 1, 5}, {4, 8, -7, 2, 3}, {3, 6, 4, 1, 4}, {1, 0, 9, 5, -4}};
        int[] newArr = new int[arr.length];

        printArray(arr);
        InitArrayWithElementsOfMainDiag(arr, newArr);
        System.out.print("\npositive elements of the main diagonal of a square matrix: ");
        printPositiveElementsOfMainDiag(newArr);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void InitArrayWithElementsOfMainDiag(int[][] arr, int[] newArr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    newArr[i] = arr[i][j];
                }
            }
        }
    }

    public static void printPositiveElementsOfMainDiag(int[] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > 0) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
}

