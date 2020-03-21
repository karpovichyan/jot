package by.karpovich.jot.module02.sorting;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
 */
public class Task01 {
    public static void main(String[] args) {
        int[] firstArr = new int[]{2, 5, 4, 7, 9, 0};
        int[] secondArr = new int[]{3, 6, 0, 1};
        int k = 4;

        int sumArrLength = firstArr.length + secondArr.length;
        int[] resultArr = new int[sumArrLength];

        printArray("first", firstArr);
        printArray("second", secondArr);
        insertSecondArrayInFirstArray(k, firstArr, secondArr, resultArr, sumArrLength);
        printArray("result", resultArr);
    }

    public static void insertSecondArrayInFirstArray(int k, int[] firstArr, int[] secondArr, int[] resultArr, int sumArrLength) {
        for (int i = 0; i < k; i++) {
            resultArr[i] = firstArr[i];
        }

        int j = 0;
        for (int i = k; i < secondArr.length + k; i++) {
            resultArr[i] = secondArr[j];
            j++;
        }

        for (int i = secondArr.length + k; i < sumArrLength; i++) {
            resultArr[i] = firstArr[k];
            k++;
        }
    }

    public static void printArray(String str, int[] arr) {
        System.out.println(str + " array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

