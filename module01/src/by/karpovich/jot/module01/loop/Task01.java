package by.karpovich.jot.module01.loop;

import java.util.Scanner;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число.
   А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task01 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print(">> ");
        int aNumber = Integer.parseInt(reader.nextLine());

        int sum = 0;
        for (int i = 1; i <= aNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
