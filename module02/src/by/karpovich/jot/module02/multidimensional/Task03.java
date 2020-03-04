package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task03 {
    public static void main(String[] args) {
        int[][] arr = new int[4][6];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int k = 3;
        int p = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == k - 1) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == p - 1) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
    }
}

