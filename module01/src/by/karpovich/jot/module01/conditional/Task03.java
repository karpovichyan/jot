package by.karpovich.jot.module01.conditional;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task03 {

    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 1;
        double y3 = 1;
        boolean result = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);

        if (result) {
            System.out.println("Points are located on one line ");
        } else {
            System.out.println("Points are not located on one line");
        }
    }
}
