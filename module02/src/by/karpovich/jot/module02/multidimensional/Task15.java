package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] arr = initArray(5);
        printArray(arr);
        System.out.println("\nmax element of matrix: " + maxElemOfArray(arr) + "\n");
        changedArray(arr, maxElemOfArray(arr));
        printArray(arr);
    }

    public static int[][] initArray(int n) {
        int[][] arr = new int[n][n];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int maxElemOfArray (int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void changedArray(int[][] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }
    }
}
