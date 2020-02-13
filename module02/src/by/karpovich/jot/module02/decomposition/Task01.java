package by.karpovich.jot.module02.decomposition;

/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОK (А, В) = (А * В) / НОД (А, В)
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.println("Least common multiple: " + getNok(100, 40));
    }

    public static int getNodOfTwoNumbers(int a, int b) {
        int temp = 1;

        for (int i = Math.max(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                temp = i;
                System.out.println("Greatest common divisor: " + i);
                break;
            }
        }
        return temp;
    }

    public static int getNok(int a, int b) {
        return (a * b) / getNodOfTwoNumbers(a, b);
    }
}