package by.karpovich.jot.module02.sorting;

/*
4. Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
   Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка.
   Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
   Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task04 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 0, 3, 8, 9, 5, 2};
        printArray(arr);
        exchangeSort(arr);
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void exchangeSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
