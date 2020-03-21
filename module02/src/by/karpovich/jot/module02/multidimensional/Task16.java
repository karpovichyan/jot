package by.karpovich.jot.module02.multidimensional;

/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
    составленная из чисел 1, 2, 3,...,n^2 так, что суммы по каждому столбцу,
    каждой строке и каждой из двух больших диагоналей равны между собой.
    Построить такой квадрат. Пример магического квадрата порядка 3:
                        6 1 8
                        7 5 3
                        2 9 4
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 3;
        initMagicSquare(n);
    }

    public static void initMagicSquare(int n) {
        int[][] arr = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int number = 1; number <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else if (j == n) {
                j = 0;
            } else if (i < 0) {
                i = n - 1;
            }

            if (arr[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                arr[i][j] = number++;
            }
            j++;
            i--;
        }

        System.out.println("Sum of each row or column " + n * (n * n + 1) / 2);
        System.out.println("The Magic Square for " + n + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
