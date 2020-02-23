package by.karpovich.jot.module02.arrays;

import java.util.Random;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task05 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        printArray(arr);
        System.out.println(" ");
        sortArray(arr);
    }

    public static void printArray(int[] arr) {

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
