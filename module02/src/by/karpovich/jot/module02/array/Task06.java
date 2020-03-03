package by.karpovich.jot.module02.array;

/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
   являются простыми числами.
 */
public class Task06 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] - " + arr[i]);

            int countOfDivider = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countOfDivider++;
                }
            }
            if (countOfDivider == 2) {
                sum += arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("sum = " + sum);
    }
}