package by.karpovich.jot.module02.multidimensional;

/*
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}