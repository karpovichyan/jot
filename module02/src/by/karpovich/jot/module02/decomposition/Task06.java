package by.karpovich.jot.module02.decomposition;

/*
6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task06 {
    public static void main(String[] args) {
        findCoprimeNumbers(3, 11, 7);
    }

    public static void findCoprimeNumbers(int a, int b, int c) {
        for (int i = Math.max(Math.max(a, b), c); i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                if (i == 1) {
                    System.out.println("coprime numbers");
                } else {
                    System.out.println("not coprime numbers");
                }
                break;
            }
        }
    }
}
