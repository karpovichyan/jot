package by.karpovich.jot.module02.decomposition;

import java.util.Random;
import java.util.Scanner;

/*
8. Задан массив D. Определить следующие суммы:
    D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех
    последовательно расположенных элементов массива с номерами от k до m.
 */
public class Task08 {
    public static void main(String[] args) {
        int[] arr = initArray(6);
        printArray(arr);
        System.out.println("sum = " + calculateSum(arr, readFromConsole()));
    }

    public static int[] initArray(int n) {
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
        System.out.println();
    }

    public static int readFromConsole() {
        Scanner reader = new Scanner(System.in);
        System.out.print(">> ");
        return Integer.parseInt(reader.nextLine());
    }

    public static int calculateSum(int[] arr, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++) {
            if (k == arr.length || k == arr.length - 1) {
                System.out.println("after the element in position " + k + " there are no three sequential array elements");
                break;
            } else if (k <= 0) {
                System.out.println("zero or negative position does not exist");
                break;
            } else if (k > arr.length) {
                System.out.println(k + " position in array does not exist");
                break;
            }
            sum = sum + arr[i];
        }
        return sum;
    }
}
