package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
   Определить, какой столбец содержит максимальную сумму.
 */
public class Task09 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        //int[][] arr = new int[][]{{1, 3, 0, 0, 2}, {8, 3, 0, 1, 5}, {4, 8, 7, 2, 3}, {3, 6, 4, 1, 4}, {1, 0, 9, 5, 4}};

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[] sumArr = new int[5];
        for (int k = 0; k < arr.length; k++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == k) {
                        sum = arr[i][j] + sum;
                    }
                }
            }
            sumArr[k] = sum;
        }

        int max = sumArr[0];
        int columnOfMaxSum = 0;

        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
            if (max < sumArr[i]) {
                max = sumArr[i];
                columnOfMaxSum = i + 1;
            }
            if (max == sumArr[0]) {
                columnOfMaxSum = 1;
            }

        }
        System.out.println("\n\n" + columnOfMaxSum + " column contains the max sum");
        System.out.println();
    }
}
