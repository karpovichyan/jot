package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
   Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task04 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double r = Double.parseDouble(reader.nextLine());
        int a = (int) r;
        int b = (int) Math.round(r % 1 * 1000);

        System.out.println(b + "." + a);
    }
}
