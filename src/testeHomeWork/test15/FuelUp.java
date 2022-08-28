package testeHomeWork.test15;

public class FuelUp {
    public static double calculateFuel(double n) {
        double distance = n * 10;
        if (distance > 100) {
            return distance;
        }
        return 100;
    }
}
/* double distance = 1;
        for (int i = 0; i < n; i++) {
            distance = n * 10;
            if (distance > 100) {
                return distance;
            } else if (distance < 100) {
                return 100;
            }
        }
        return 100;
    }
}
*/
