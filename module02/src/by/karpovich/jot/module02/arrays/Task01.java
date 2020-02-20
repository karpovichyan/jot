package by.karpovich.jot.module02.arrays;

import java.util.Random;

/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task01 {
    public static void main(String[] args) {

        int size = 10;
        int[] arr = new int[size];

        System.out.println("sum: " + sum(arr, 5));
        printArray(arr);
    }

    public static int sum(int[] arr, int k) {
        int sum = 0;
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);

            if (arr[i] % k == 0) {
                sum = arr[i] + sum;
            }
        }
        return sum;
    }

    public static void printArray(int[] arr) {
        System.out.print("\narray: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}