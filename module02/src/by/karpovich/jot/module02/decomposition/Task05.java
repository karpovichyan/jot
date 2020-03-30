package by.karpovich.jot.module02.decomposition;

import java.util.Random;

/*
5. Составить программу, которая в массиве A[N] находит второе по величине число
    (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task05 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = initArray(n);

        printArray(arr);
        System.out.println("second largest number is " + findSecondLargestNumber(arr, maxNumber(arr)));
    }

    public static int[] initArray(int n) {
        int[] arr = new int[n];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSecondLargestNumber(int[] arr, int max) {
        int maxSecond = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxSecond < arr[i] && arr[i] < max) {
                maxSecond = arr[i];
            }
        }
        return maxSecond;
    }
}

