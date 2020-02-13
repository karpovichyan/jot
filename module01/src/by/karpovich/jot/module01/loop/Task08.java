package by.karpovich.jot.module01.loop;

import java.util.Scanner;

/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task08 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number №1: ");
        int numOne = Math.abs(Integer.parseInt(reader.nextLine()));

        System.out.print("Enter the number №2: ");
        int numTwo = Math.abs(Integer.parseInt(reader.nextLine()));

        int numOneWithoutDuplicates = 0;

        for (int i = 9; i >= 0; i--) {
            for (int j = numOne; j > 0; j /= 10) {
                int lastDigit = j % 10;
                if (i == lastDigit) {
                    numOneWithoutDuplicates = numOneWithoutDuplicates * 10 + i;
                    break;
                }
            }
        }

        for (int i = numOneWithoutDuplicates; i > 0; i /= 10) {
            for (int j = numTwo; j > 0; j /= 10) {
                int lastDigitFromFirstNum = i % 10;
                int lastDigitFromSecondNum = j % 10;

                if (lastDigitFromFirstNum == lastDigitFromSecondNum) {
                    System.out.print(lastDigitFromFirstNum + " ");
                    break;
                }
            }
        }
    }
}


