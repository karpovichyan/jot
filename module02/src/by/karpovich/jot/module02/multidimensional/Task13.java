package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] arr = initArray(5);
        printArray(arr);

        System.out.println("\nSort Ascending: ");
        sortColumnsAscending(arr);
        printArray(arr);

        System.out.println("\nSort Descending: ");
        sortColumnsDescending(arr);
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
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void sortColumnsAscending(int[][] arr) {
        int min;
        int indexMin;

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                min = arr[i][k];
                indexMin = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[j][k]) {
                        min = arr[j][k];
                        indexMin = j;
                    }
                }
                arr[indexMin][k] = arr[i][k];
                arr[i][k] = min;
            }
        }
    }

    public static void sortColumnsDescending(int[][] arr) {
        int max;
        int indexMax;

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                max = arr[i][k];
                indexMax = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (max < arr[j][k]) {
                        max = arr[j][k];
                        indexMax = j;
                    }
                }
                arr[indexMax][k] = arr[i][k];
                arr[i][k] = max;
            }
        }
    }
}
