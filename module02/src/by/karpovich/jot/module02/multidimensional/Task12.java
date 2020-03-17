package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] arr = initArray(5);
        printArray(arr);

        System.out.println("\nSort Ascending: ");
        sortRowsAscending(arr);
        printArray(arr);

        System.out.println("\nSort Descending: ");
        sortRowsDescending(arr);
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

    public static void sortRowsAscending(int[][] arr) {
        int min;
        int indexMin;

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                min = arr[k][i];
                indexMin = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[k][j]) {
                        min = arr[k][j];
                        indexMin = j;
                    }
                }
                arr[k][indexMin] = arr[k][i];
                arr[k][i] = min;
            }
        }
    }

    public static void sortRowsDescending(int[][] arr) {
        int max;
        int indexMax;

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                max = arr[k][i];
                indexMax = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (max < arr[k][j]) {
                        max = arr[k][j];
                        indexMax = j;
                    }
                }
                arr[k][indexMax] = arr[k][i];
                arr[k][i] = max;
            }
        }
    }
}
