package by.karpovich.jot.module01.loop;

/*
2. Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task02 {

    public static void main(String[] args) {

        int a = -5;
        int b = 8;
        int h = 2;

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                System.out.println(x);
            } else {
                System.out.println(-x);
            }
        }
    }
}
