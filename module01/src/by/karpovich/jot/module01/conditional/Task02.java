package by.karpovich.jot.module01.conditional;

/*
2. Найти max{min(a, b), min(c, d)}.
 */
public class Task02 {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 4;
        int d = 4;
        int min1, min2;

        min1 = a < b ? a : b;
        min2 = c > d ? d : c;
        System.out.println("max = " + Math.max(min1, min2));
    }
}

