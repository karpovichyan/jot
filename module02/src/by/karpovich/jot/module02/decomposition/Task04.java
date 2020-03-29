package by.karpovich.jot.module02.decomposition;

import java.util.Random;

/*
4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
   между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Task04 {
    public static void main(String[] args) {

        int n = 3;
        int[] xCoordinates = new int[n];
        int[] yCoordinates = new int[n];

        System.out.println("coordinates: ");
        initArrayCoordinates(xCoordinates, yCoordinates);
        printArrayCoordinates(xCoordinates, yCoordinates);

        int[] index = calculateMaxDistanceBetweenPoints(xCoordinates, yCoordinates);
        System.out.print("maximum distance between points " + "(" + xCoordinates[index[0]] + ", " + yCoordinates[index[0]] + "); " + "(" + xCoordinates[index[1]] + ", " + yCoordinates[index[1]] + ")");
    }

    public static void initArrayCoordinates(int[] xArr, int[] yArr) {
        Random random = new Random();
        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = random.nextInt(10);
            yArr[i] = random.nextInt(10);
        }
    }

    public static void printArrayCoordinates(int[] xArr, int[] yArr) {
        for (int i = 0; i < xArr.length; i++) {
            System.out.println("(" + xArr[i] + ", " + yArr[i] + ")");
        }
        System.out.println();
    }

    public static int[] calculateMaxDistanceBetweenPoints(int[] xArr, int[] yArr) {
        int[] indexBetweenPoints = new int[2];
        double max = 0;

        for (int i = 0; i < xArr.length; i++) {
            for (int j = i + 1; j < xArr.length; j++) {
                double resultDistance;
                resultDistance = Math.sqrt(Math.pow(xArr[i] - xArr[j], 2) + Math.pow(yArr[i] - yArr[j], 2));
                if (max < resultDistance) {
                    indexBetweenPoints[0] = i;
                    indexBetweenPoints[1] = j;
                    max = resultDistance;
                }
            }
        }
        return indexBetweenPoints;
    }
}


