package by.karpovich.jot.module02.decomposition;

/*
7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task07 {
    public static void main(String[] args) {
        System.out.println(calculateSum());
    }

    public static int calculateSum() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                int factorial = 1;
                for (int j = 1; j < i + 1; j++) {
                    factorial = factorial * j;
                }
                sum = factorial + sum;
            }
        }
        return sum;
    }
}

