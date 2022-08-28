import testeHomeWork.Vehicle;

public class Car extends Vehicle {

    private String name;
    private String colour;
    private String model;
    private String gearbox;
    private String plate;
    private double km;
    private int year;
    private int kmperhour;


    Car(String name, String colour, String model, String gearbox, String plate, double km, int year, int kmperhour) {
        this.name = name;
        this.colour = colour;
        this.model = model;
        this.gearbox = gearbox;
        this.plate = plate;
        this.km = km;
        this.year = year;
        this.kmperhour = kmperhour;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getPlate() {
        return plate;
    }

    public double getKm() {
        return km;
    }

    public int getYear() {
        return year;
    }

    public int getKmperhour() {
        return kmperhour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKmperhour(int kmperhour) {
        this.kmperhour = kmperhour;
    }

    public static void printCarsBmw(Car car) {
        if (car.name.equals("BMW")) {
            System.out.println(("The " + car.name + " is " + car.model));
        }

    }

    public static void printTheBlackCars(Car car) {
        if (car.colour.equals("Black")) {
            System.out.println("This  " + car.model + " is black ");
        }
    }

    public static void maxSpeedperHour(Car car) {
        if (car.kmperhour > 255) {
            System.out.println("The fastest from the garage is " + car.model + " ! ");
        }
    }

    public static void theNewestCar(Car car) {
        if (car.year >= 2015) {
            System.out.println("This " + car.model + " made it it " + car.year + " is the newest car .");
        }
    }

    public static void printAudiCar(Car car) {
        if (car.name.equals("Audi")) {
            System.out.println(car.name + " " + car.model + " is parked in our Garage.");
        }
    }

    public static void isThePlateNumber(Car car) {
        if (car.plate.equals("B123AXR")) {
            System.out.println("The " + car.name + " " + car.model + " with the plate number " + car.plate + " is parked.");
        }
    }

    public static void theBestCar(Car car) {
        if (car.year >= 2015 && car.km <= 150.000 && car.gearbox.equals("Automatic")) {
            System.out.println("This car is the best deal " + car.name + " " + car.model);
        }
    }

    @Override
    public String getIdentity() {
        return null;
    }

    @Override
    public void go() {

    }
}

