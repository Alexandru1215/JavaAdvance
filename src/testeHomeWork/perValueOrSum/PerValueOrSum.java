package testeHomeWork.perValueOrSum;

public class PerValueOrSum {
    public static boolean makesTen(int a, int b) {

        if (a + b == 10) {
            return true;
        } else if (a == 10 || b == 10) {
            return true;
        } else
            return false;

    }
}