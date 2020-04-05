package by.karpovich.jot.module02.decomposition;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
    Для решения задачи использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        int[] arr = initArray(40);
        printArray(arr);

        int[] arrWithPrimeNumbers = new int[findNumbersOfPrime(arr)];
        findPrimeNumbers(arr, arrWithPrimeNumbers);
        System.out.println("twins: ");
        findTwins(arrWithPrimeNumbers);
    }

    public static int[] initArray(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findNumbersOfPrime(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                n++;
            }
        }
        return n;
    }

    public static void findPrimeNumbers(int[] arr, int[] arr2) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                arr2[n] = arr[i];
                n++;
            }
        }
    }

    public static void findTwins(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++){
                if (arr[i] + 2 == arr[j]) {
                    System.out.println(arr[i] + " " + arr[i + 1]);
                }
            }
        }
    }
}
