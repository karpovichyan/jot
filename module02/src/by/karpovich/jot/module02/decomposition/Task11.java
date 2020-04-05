package by.karpovich.jot.module02.decomposition;

/*
11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {

        int a = 45667;
        int b = 1234;
        compareTwoNumbers(getNumberOfDigits(a), a, getNumberOfDigits(b), b);
    }

    public static int getNumberOfDigits(int a) {
        int j = 0;
        for (int i = a; i > 0; i /= 10) {
            j++;
        }
        return j;
    }

    public static void compareTwoNumbers(int a, int a1, int b, int b1) {
        if (a > b) {
            System.out.println("number of digits in " + a1 + " more");
        } else if (a < b) {
            System.out.println("number of digits in " + b1 + " more");
        } else {
            System.out.println("same number of digits");
        }
    }
}
