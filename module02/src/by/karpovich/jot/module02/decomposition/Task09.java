package by.karpovich.jot.module02.decomposition;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
   Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */
public class Task09 {
    public static void main(String[] args) {

        System.out.println("area - " + getAreaOfQuadrangle(3, 4, 6, 5));
    }

    public static double getAreaOfFirstTriangle(int x, int y) {
        return x * y / 2;
    }

    public static double getAreaOfSecondTriangle(int x, int y, int z, int t) {
        double d = Math.hypot(x, y);
        double perimetrOfSecondTriangle = z + t + d;

        return Math.sqrt(perimetrOfSecondTriangle * (perimetrOfSecondTriangle - z) * (perimetrOfSecondTriangle - t) * (perimetrOfSecondTriangle - d)); // Heron's formula
    }

    public static double getAreaOfQuadrangle(int x, int y, int z, int t) {
        return getAreaOfFirstTriangle(x, y) + getAreaOfSecondTriangle(x, y, z, t);
    }
}
