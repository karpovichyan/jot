package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
   принадлежит закрашенной области, и false — в противном случае:
*/
public class Task06 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("x = ");
        double x = Double.parseDouble(reader.nextLine());
        System.out.print("y = ");
        double y = Double.parseDouble(reader.nextLine());

        boolean pointInFirstQuarter = x >= 0 && y >=0 && x <= 2 && y <= 4;
        boolean pointInSecondQuarter = x <= 0 && y >= 0 && x >= -2 && y <= 4;
        boolean pointInThirdQuarter = x <= 0 && y <= 0 && x >= -4 && y >= -3;
        boolean pointInFourthQuarter = x >= 0 && y <= 0 &&  x <= 4 && y >= -3;

        boolean result = pointInFirstQuarter || pointInSecondQuarter || pointInThirdQuarter || pointInFourthQuarter;

        System.out.println(result);
    }
}
