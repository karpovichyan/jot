package by.karpovich.jot.module02.array;

import java.util.Random;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task09 {
    public static void main(String[] args) {
        int[] initialArray = createArray(10);
        printArray(initialArray);
        int[] arrayWithRepeatedNumber = createArrayWithRepeatedNumber(initialArray);

        int maxRepeat = getMaxRepeat(initialArray, arrayWithRepeatedNumber);
        int minNumber = getMinNumber(initialArray, arrayWithRepeatedNumber, maxRepeat);

        System.out.println("\nresult " + minNumber);
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] createArrayWithRepeatedNumber(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if ((arr[i] == arr[j]) && (count > 1)) {
                    arr2[i] = count;
                }
            }
        }
        return arr2;
    }

    public static int getMaxRepeat(int[] array, int[] arr2) {
        int maxRepeat = arr2[0];

        for (int i = 0; i < array.length; i++) {
            if (maxRepeat < arr2[i]) {
                maxRepeat = arr2[i];
            }
        }
        return maxRepeat;
    }

    public static int getMinNumber(int[] array, int[] arr2, int maxRepeat) {
        int minNumber = array[0];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == maxRepeat) {
                if (array[i] < minNumber) {
                    minNumber = array[i];
                }
            }
        }
        return minNumber;
    }
}

