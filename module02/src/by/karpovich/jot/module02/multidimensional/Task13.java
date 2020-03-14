package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSort Ascending: \n");

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSort Descending: \n");

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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
