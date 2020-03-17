package by.karpovich.jot.module02.multidimensional;

import java.util.Random;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int[][] arr = initArray(10, 20);
        printArray(arr);
        int[] arrOfFive = new int[arr.length];
        calculateFivesAndRows(arr, arrOfFive);
        System.out.print("\nnumber of a row: ");
        printRows(arrOfFive);
    }

    public static int[][] initArray(int m, int n) {
        int[][] arr = new int[m][n];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(15);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("row № " + (i + 1) + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void calculateFivesAndRows(int[][] arr, int[] arrOfFive) {
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
    }

    public static void printRows(int[] arrOfFive) {
        for (int i = 0; i < arrOfFive.length; i++) {
            if (arrOfFive[i] > 0) {
                System.out.print(arrOfFive[i] + " ");
            }
        }
    }
}
