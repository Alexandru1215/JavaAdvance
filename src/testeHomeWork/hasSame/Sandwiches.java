package testeHomeWork.hasSame;

import java.util.Arrays;

public class Sandwiches {
    public static boolean hasSameBread(String[] a, String[] b) {

        return a[0].equals(b[0]) && (a[a.length - 1].equals(b[b.length - 1]));
    }
}


