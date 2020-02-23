package by.karpovich.jot.module02.arrays;

/*
7. Даны действительные числа a1, a2,...,a2n. Найти max(a1 + a2n, a2 + a2n-1,...,an + an+1)
 */
public class Task07 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 12, -3, 8, 4, 17, 45, 1, 75, 5};
        int[] newArr = new int[5];

        printArray(arr);
        newArrayWithNewdigits(arr, newArr);
        System.out.println("\nmax: " + maxOfNewArray(newArr));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void newArrayWithNewdigits(int[] arr, int[] newArr) {
        int newDigitsOfMax;

        for (int i = 0; i < arr.length / 2; i++) {
            newDigitsOfMax = arr[i] + arr[arr.length - 1 - i];
            newArr[i] = newDigitsOfMax;
            System.out.print(newArr[i] + " ");
        }
    }

    public static int maxOfNewArray(int[] newArr) {
        int max = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > max) {
                max = newArr[i];
            }
        }
        return max;
    }
}






