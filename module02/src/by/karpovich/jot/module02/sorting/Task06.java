package by.karpovich.jot.module02.sorting;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Task06 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 0, 3, 8, 9, 5, 2, 6};
        printArray(arr);
        shellSort(arr);
        printArray(arr);
    }

    public static void shellSort(int[] arr) {
        int h = 1;
        int n = arr.length;

        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    int temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
