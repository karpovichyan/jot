package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task01 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

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
