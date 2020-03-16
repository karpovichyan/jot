package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task03 {
    public static void main(String[] args) {

        int[][] arr = initArr(4, 5);
        printArr(arr);
        System.out.println();
        printRow(arr, 2);
        System.out.println();
        printColumn(arr, 4);
    }

    public static int[][] initArr(int m, int n) {
        int[][] arr = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void printRow(int[][] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == k - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void printColumn(int[][] arr, int p) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == p - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

