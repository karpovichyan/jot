package by.karpovich.jot.module01.conditional;

import java.util.Scanner;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
   и если да, то будет ли он прямоугольным.
 */
public class Task01 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstAngle = Integer.parseInt(reader.nextLine());
        int secondAngle = Integer.parseInt(reader.nextLine());
        int thirdAngle = 180 - firstAngle - secondAngle;

        int sumOfAngles = firstAngle + secondAngle + thirdAngle;

        boolean triangleExist = firstAngle > 0 && secondAngle > 0 && thirdAngle > 0 && sumOfAngles == 180;
        boolean isRectangular = firstAngle == 90 || secondAngle == 90 || thirdAngle == 90;

        if (triangleExist) {
            System.out.print("The triangle is valid ");
            if (isRectangular) {
                System.out.println("and rectangular");
            }
        } else {
            System.out.println("The triangle doesn't exist");
        }
    }
}