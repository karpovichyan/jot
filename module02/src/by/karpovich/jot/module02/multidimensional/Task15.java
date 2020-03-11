package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        //int[][] arr = new int[][]{{2, 5, 9, 4, -1}, {8, 3, 0, 1, 5}, {4, 5, 8, 1, 2}, {3, 6, 4, 1, 4}, {1, 0, 9, 5, -4}};

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max element of matrix: " + max + "\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 != 0) {
                arr[i][j] = max;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
