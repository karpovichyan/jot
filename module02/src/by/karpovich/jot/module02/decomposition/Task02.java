package by.karpovich.jot.module02.decomposition;

import java.util.Scanner;

/*
2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task02 {
    public static void main(String[] args) {

        int a = printNumbers("first number");
        int b = printNumbers("second number");
        int c = printNumbers("third number");
        int d = printNumbers("fourth number");

        System.out.println("Nod of " + a + ", " + b + ", " + c + ", " + d + " is " + getNodOfFourNumbers(a, b, c, d));

    }

    public static int printNumbers(String number) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(number + ": ");
        int x = scanner.nextInt();

        return x;
    }

    public static int getNodOfFourNumbers(int a, int b, int c, int d) {
        int temp = 1;

        for (int i = Math.max(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                temp = i;
                break;
            }
        }
        for (int i = Math.max(temp, c); i > 0; i--) {
            if (temp % i == 0 && c % i == 0) {
                temp = i;
                break;
            }
        }
        for (int i = Math.max(temp, d); i > 0; i--) {
            if (temp % i == 0 && d % i == 0) {
                temp = i;
                break;
            }
        }
        return temp;
    }
}
