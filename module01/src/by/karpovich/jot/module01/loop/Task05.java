package by.karpovich.jot.module01.loop;

import java.util.Scanner;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
   модуль которых больше или равен заданному е. Общий член ряда имеет вид: an = 1/2^n + 1/3^n
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number e: ");
        double e = Double.parseDouble(reader.nextLine());

        System.out.print("Enter number n: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println(" ");

        double sum = 0;

        int powMultiplier = n > 0 ? 1 : -1;

        for (int i = 0; i <= Math.abs(n); i++) {
            double memberOfSeries = 1 / (Math.pow(2, i * powMultiplier)) + 1 / (Math.pow(3, i * powMultiplier));
            if (Math.abs(memberOfSeries) >= e) {
                sum += memberOfSeries;
                System.out.println("memer of series №" + i + ": " + memberOfSeries);
            }
        }
        System.out.println("\nsum of members = " + sum + "\n");
    }
}