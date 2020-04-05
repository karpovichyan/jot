package by.karpovich.jot.module02.decomposition;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
    если сумма его цифр, возведенных в степень n, равна самому числу.
    Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {

        int k = 1000000;

        for (int i = 1; i < k; i++) {
            int sum = 0;
            int countOfDigit = 0;

            for (int j = i; j > 0; j /= 10) {
                countOfDigit++;
            }

            for (int j = i; j > 0; j /= 10) {
                int digit = j % 10;
                int armstrong = (int) Math.pow(digit, countOfDigit);
                sum = sum + armstrong;
            }

            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}


