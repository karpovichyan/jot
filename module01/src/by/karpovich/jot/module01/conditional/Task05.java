package by.karpovich.jot.module01.conditional;

/*
5. Вычислить значение функции:
 */
public class Task05 {

    public static void main(String[] args) {
        double x = 4;

        if (x > 3) {
            System.out.println("f(x) = " + (1 / (Math.pow(x, 3) + 6)));
        } else {
            System.out.println("f(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        }
    }
}
