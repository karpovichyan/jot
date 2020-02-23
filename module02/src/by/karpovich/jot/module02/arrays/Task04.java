package by.karpovich.jot.module02.arrays;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task04 {
    public static void main(String[] args) {

        int[] arr = new int[]{-2, -1, -7, 1, 2, -3, 4, 5};

        replaceMaxMin(arr);
        System.out.println();
        printArray(arr);
    }

    public static void replaceMaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];
        int iMax = 0;
        int iMin = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
                iMax = i;
            } else if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
        }
        arr[iMax] = min;
        arr[iMin] = max;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
