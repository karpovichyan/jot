package by.karpovich.jot.module02.multidimensional;

import java.util.Random;
import java.util.Scanner;

/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е.
   все элементы одного столбца поставить на соответствующие им позиции другого,
   а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task08 {
    public static void main(String[] args) {

        int sizeOfRow = 4;
        int sizeOfColumn = 5;

        int[][] arr = new int[sizeOfRow][sizeOfColumn];
        int[][] tempArr = new int[2][sizeOfRow];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of the first column: ");
        int firstColumn = Integer.parseInt(scanner.nextLine());
        System.out.print("enter the number of the second column: ");
        int secondColumn = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == firstColumn - 1) {
                    tempArr[0][i] = arr[i][j];
                }
                if (j == secondColumn - 1) {
                    tempArr[1][i] = arr[i][j];
                }
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == firstColumn  - 1) {
                    arr[i][j] = tempArr[1][i];
                }
                if (j == secondColumn - 1) {
                    arr[i][j] = tempArr[0][i];
                }
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
