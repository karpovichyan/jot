package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
   Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/
public class Task05 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = Integer.parseInt(reader.nextLine());
        int h = t / 3600; // in hours
        int m = (t / 60) % 60; // in minutes
        int s = t % 60; // in seconds

        System.out.println(h + "ч " + m + "мин " + s + "c");
    }
}
