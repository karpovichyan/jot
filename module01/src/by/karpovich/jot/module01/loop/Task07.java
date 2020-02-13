package by.karpovich.jot.module01.loop;

import java.util.Scanner;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
   m и n вводятся с клавиатуры.
 */
public class Task07 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number m: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.print("Enter the number n: ");
        int n = Integer.parseInt(reader.nextLine());

        System.out.println();

        for (int i = m; i <= n; i++) {
            System.out.print("Number " + i + "\nHis deviders:  ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && (j != i && j != 1)) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
