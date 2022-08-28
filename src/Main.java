import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*String[] cars = new String[]{"Audi", "BMW", "Ford", "BMW"};
        String[] colour = new String[]{"Black", "Marine-Blue", "NardoGrey"};
        String[] model = new String[]{"S-line", "Seria 3 Xdrive", "Mustang Eco-Boost", "Seria 5 F-10"};
        String[] gearbox = new String[]{"Automatic", "Manual", "Manual", "Automatic"};
        double[] km = new double[]{135.000, 150.000, 120.000, 170.000};
        int[] year = new int[]{2010, 2011, 2015, 2015};
        int[] kmPerHour = new int[]{220, 240, 240, 280};
        boolean isFaster = true;
        System.out.println(cars[1].equals(cars[2]));
        cars[1].startsWith("A");
        System.out.println(cars[0].startsWith("A"));*/

        //sa printam toate masinile BMW si modelul

        Car car1 = new Car("Audi", "Black", "A5  S-Line", "Automatic", "B123AXR",135.000, 2010, 220);
        Car car2 = new Car("BMW", "Marine-Blue", "Seria 3 Xdrive", "Manual","B100BAD", 150.000, 2011, 240);
        Car car3 = new Car("Ford", "NardoGrey", "Mustang Eco-Boost", "Manual", "CT123MAN",120.000, 2015, 240);
        Car car4 = new Car("BMW", "Black", "Seria 5 F-10", "Automatic", "BV323FAB",170.000, 2015, 280);
        Car car5 = new Car("Mazda","Black and Red"," Mazda 6", "Automatic","B23SUR",100.000,2018,285);
        Car[] cars = new Car[]{car1, car2, car3, car4,car5};
        Car car6 = new Car("Renault","Black"," RS", "Automatic","CV112BUR",123.000,2020,200);
      // Car car5 = new Car("Mazda","Black and Red"," Mazda 6", "Automatic",100.000,2018,200);
     // Car [] cars = new Car[]{car5};

        int maxSpeed = 0;
        boolean fastestCar  = true;
        for (int i = 0; i < cars.length; i++) {
            Car.printCarsBmw(cars[i]);
        } // sa se printeze masinile de culoare neagra
        for (int i = 0; i < cars.length; i++) {
            Car.printTheBlackCars(cars[i]);
        } // se se printeze cea mai rapida -
        //for (int i = 0; i < cars.length; i++) {
           //if(maxSpeed== cars.length){
            //   Car.maxSpeedperHour(cars[i]);
          // }
       // }//sa se printeze cea mai noua masina
        for (int i = 0; i < cars.length; i++) {
            Car.theNewestCar(cars[i]);
        }//  sa se printeze Audi .
        for (int i = 0; i < cars.length; i++) {
            Car.printAudiCar(cars[i]);
        }
        System.out.println(car5.equals(cars));
        if(car5.equals(car1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        for (int i=0; i<cars.length;i++){
            Car.isThePlateNumber(cars[i]);
        }

        for(int i=0; i< cars.length;i++){
            Car.maxSpeedperHour(cars[i]);
            car6.equals(cars[i]);
            if(maxSpeed > 200|| maxSpeed <300){
                Car.maxSpeedperHour(cars[i]);
            }
        }
        System.out.println(cars.equals(car1==car2));
        System.out.println(car6==car1);
        System.out.println(car6.equals(car1));

        maxSpeed = cars.length;
        System.out.println(maxSpeed);
            for(int i=0; i< cars.length;i++){
                Car.theBestCar(cars[i]);
            }
    }
}

