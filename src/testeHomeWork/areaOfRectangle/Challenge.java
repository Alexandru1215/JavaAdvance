package testeHomeWork.areaOfRectangle;

public class Challenge {
    public static int getArea(int h, int w) {
        if (h <= 0 || w <= 0) {
            return -1;
        } else
            return h * w;
    }
}