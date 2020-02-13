package by.karpovich.jot.module01.loop;

/*
3. Найти сумму квадратов первых ста чисел.
 */
public class Task03 {

    public static void main(String[] args) {
        int sumOfPow = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfPow += (int) Math.pow(i, 2);
        }
        System.out.println(sumOfPow);
    }
}
