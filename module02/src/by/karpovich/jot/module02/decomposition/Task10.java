package by.karpovich.jot.module02.decomposition;

/*
10. Дано натуральное число N. Написать метод(методы) для формирования массива,
    элементами которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String args[]) {
        int n = 123456;
        int[] arr = initArray(getLengthOfArray(n), n);
        printArray(arr);
    }

    public static int getLengthOfArray(int n) {
        int k = 0;
        for (int i = n; i > 0; i /= 10) {
            int a = n / i;
            k++;
        }
        return k;
    }

    public static int[] initArray(int k, int n) {
        int count = 0;
        int[] arr = new int[k];
        for (int i = 1; i < n + 1; i *= 10) {
            int a = n / i % 10;
            arr[count] = a;
            count++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[arr.length - 1 - i] + "]");
        }
    }
}
