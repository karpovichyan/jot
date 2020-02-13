package by.karpovich.jot.module01.conditional;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class Task04 {

    public static void main(String[] args) {
        int slotASize = 9;
        int slotBSize = 9;

        int brickXSize = 0;
        int brickYSize = 8;
        int brickZSize = 8;

        boolean firstEdge = (slotASize >= brickXSize && slotBSize >= brickYSize) || (slotASize >= brickYSize && slotBSize >= brickXSize);
        boolean secondEdge = (slotASize >= brickXSize && slotBSize >= brickZSize) || (slotASize >= brickZSize && slotBSize >= brickXSize);
        boolean thirdEdge = (slotASize >= brickYSize && slotBSize >= brickZSize) || (slotASize >= brickZSize && slotBSize >= brickYSize);

        if (firstEdge || secondEdge || thirdEdge) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will not pass");
        }
    }
}
