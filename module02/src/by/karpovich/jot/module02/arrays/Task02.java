package by.karpovich.jot.module02.arrays;

/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
   Заменить все ее члены, большие данного Z, этим числом.
   Подсчитать количество замен.
 */

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];

        printArray(arr);
        System.out.println("\nnumber of replacements: " + countOfReplace(arr, 50));
        printFinalArray(arr);
    }

    public static void printArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
    }

    public static int countOfReplace(int[] arr, int z) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        return count;
    }

    public static void printFinalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


