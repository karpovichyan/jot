package by.karpovich.jot.module01.loop;

/*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task04 {

    public static void main(String[] args) {
        long result = 1;

        for (int i = 1; i <= 200; i++) {
            result = (long) (result * Math.pow(i, 2));
        }
        System.out.println(result);
    }
}
