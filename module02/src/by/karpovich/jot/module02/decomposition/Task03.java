package by.karpovich.jot.module02.decomposition;

/*
3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.print("Area of hexagon is " + areaOfTriangle(3) * 6);
    }

    public static double areaOfTriangle(int a) {
        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }
}

