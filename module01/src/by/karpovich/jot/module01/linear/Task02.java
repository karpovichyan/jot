package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   ((𝑏+√𝑏2+4𝑎𝑐)/(2𝑎))−𝑎3𝑐+𝑏^−2
 */
public class Task02 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(reader.nextLine());

        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
    }
}
