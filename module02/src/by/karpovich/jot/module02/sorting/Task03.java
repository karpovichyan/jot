package by.karpovich.jot.module02.sorting;

/*
3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
   Требуется переставить элементы так, чтобы они были расположены по убыванию.
   Для этого в массиве, начиная с первого, выбирается наибольший элемент и
   ставится на первое место, а первый - на место наибольшего.
   Затем, начиная со второго, эта процедура повторяется.
   Написать алгоритм сортировки выбором.
 */
public class Task03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxElem = arr[i];
            int maxI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxElem) {
                    maxElem = arr[j];
                    maxI = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxI];
            arr[maxI] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
