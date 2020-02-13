package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
 1. Найдите значение функции: z = ((a – 3 ) * b / 2) + c.
*/
public class Task01 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(reader.nextLine());

        double z = ((a - 3) * b / 2) + c;

        System.out.println("((a – 3 ) * b / 2) + c = " + z);
    }
}
