package by.karpovich.jot.module02.multidimensional;

/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[][] arr = initArray(5);
        printArray(arr);
        System.out.println();
        printFirstDiag(arr);
        System.out.println();
        printSecondDiag(arr);
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
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void printFirstDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void printSecondDiag(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
