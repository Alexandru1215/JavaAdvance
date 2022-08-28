package testeHomeWork.test16;

public class Challenge {
    public static int getArea(int h, int w) {
        int area = h * w;
        if (h <= -1) {
            return -1;
        } else if (h <= 0) {
            return -1;
        } else if (w <= 0)
            return -1;

        return h * w;
    }
}