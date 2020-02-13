package by.karpovich.jot.module01.loop;

/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task06 {

    public static void main(String[] args) {

        for (long i = 0; i <= Long.MAX_VALUE; i++) {
            char character = (char) i;
            System.out.println(character + " - " + i);
        }
    }
}
