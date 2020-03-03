package by.karpovich.jot.module02.array;

import java.util.Random;
import java.util.Scanner;

/*
10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("enter a size of array: ");
        int size = Integer.parseInt(reader.nextLine());

        System.out.println(" ");

        int[] arr = new int[size];

        //int[] arr = new int[] {3, 9, 0, 3, 0, 4, 1};


        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            if (arr[i] != 0 || (arr[i] == 0 && i % 2 == 0)) {
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println(" ");

        for (int i = arr.length - j + 1; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




