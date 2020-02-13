package by.karpovich.jot.module01.linear;

import java.util.Scanner;

/*
3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   ((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))∗𝑡𝑔 𝑥𝑦
 */
public class Task03 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("x = ");
        double x = Double.parseDouble(reader.nextLine());
        System.out.print("y = ");
        double y = Double.parseDouble(reader.nextLine());

        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println(z);
    }
}
