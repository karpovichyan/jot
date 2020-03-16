package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task01 {
    public static void main(String[] args) {
        int[][] arr = initArray(5);
        printArray(arr);
        System.out.println();
        printOddColumns(arr);
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
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printOddColumns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j % 2 != 0 && (arr[0][j] > arr[arr.length - 1][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


