package by.karpovich.jot.module02.arrays;

/*
3. Дан массив действительных чисел, размерность которого N.
   Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task03 {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 0, -5, 10, 45, -6, -411, 0, 15, 45};
        countNumbers(arr);
    }

    public static void countNumbers(int[] arr) {
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("\nnumber of positive numbers: " + countPositive);
        System.out.println("number of negative numbers: " + countNegative);
        System.out.println("number of 0 numbers: " + countZero);
    }
}





