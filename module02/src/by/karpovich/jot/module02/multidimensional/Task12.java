package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        //int[][] arr = new int[][]{{2, 5, 9, 4, -1}, {8, 3, 0, 1, 5}, {4, 5, 8, 1, 2}, {3, 6, 4, 1, 4}, {1, 0, 9, 5, -4}};
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
