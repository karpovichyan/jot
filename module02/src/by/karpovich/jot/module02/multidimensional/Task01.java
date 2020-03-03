package by.karpovich.jot.module02.multidimensional;

public class Task01 {
    public static void main(String[] args) {


        int[][] array = new int[3][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
