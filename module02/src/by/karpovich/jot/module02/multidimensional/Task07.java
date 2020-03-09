package by.karpovich.jot.module02.multidimensional;

/*
7. Сформировать квадратную матрицу порядка N по правилу:

          A[i,j] = sin((i^2 - j^2) / n)

и подсчитать количество положительных элементов в ней.
 */
public class Task07 {
    public static void main(String[] args) {
        double[][] arr = new double[7][7];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Math.sin((double) (i * i - j * j) / arr.length);
                if (arr[i][j] > 0) {
                    count++;
                }
                System.out.printf("%.3f\t", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nnumber of positive elements " + count);
    }

}
