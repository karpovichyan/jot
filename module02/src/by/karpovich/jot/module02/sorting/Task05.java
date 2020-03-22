package by.karpovich.jot.module02.sorting;

/*
5. Сортировка вставками. Дана последовательность чисел a1, a2, ... , an. Требуется переставить числа в порядке
   возрастания. Делается это следующим образом. Пусть a1, a2, ... , ai - упорядоченная последовательность, т. е.
   a1 <= a2 <= ... <= an. . Берется следующее число ai+1  и вставляется в последовательность так, чтобы новая
   последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
   не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
   с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task05 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 0, 3, 8, 9, 5, 2};
        printArray(arr);
        insertionSorting(arr);
        printArray(arr);
    }

    public static void insertionSorting(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
