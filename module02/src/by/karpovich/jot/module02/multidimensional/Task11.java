package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        //int[][] arr = new int[][]{{-1, 5, 5, 5, 2}, {8, 3, 0, 1, 5}, {4, 5, 5, 5, 5}, {3, 6, 4, 1, 4}, {1, 0, 9, 5, -4}};
        int[] arrOfFive = new int[arr.length];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("row № " + (i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(15);
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
                if (count >= 3) {
                    arrOfFive[i] = i + 1;
                }
            }
        }
        System.out.print("\nnumber of a row: ");
        for (int i = 0; i < arrOfFive.length; i++) {
            if (arrOfFive[i] > 0) {
                System.out.print(arrOfFive[i] + " ");
            }
        }
    }
}
