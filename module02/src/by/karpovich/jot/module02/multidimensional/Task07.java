package by.karpovich.jot.module02.multidimensional;

/*
7. Сформировать квадратную матрицу порядка N по правилу:

          A[i,j] = sin((i^2 - j^2) / n)

и подсчитать количество положительных элементов в ней.
 */
public class Task07 {
    public static void main(String[] args) {
        double[][] arr = initArray(7);
       printArray(arr);
       System.out.println("Number of positive elements: " + numberOfPositiveElements(arr));
    }

    public static double[][] initArray(int n) {
        double[][] arr = new double[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Math.sin((double) (i * i - j * j) / arr.length);
            }
        }
        return arr;
    }

    public static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%.3f\t", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int numberOfPositiveElements(double[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

