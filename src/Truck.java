import testeHomeWork.Vehicle;

public class Truck extends Vehicle {
    String Car;

    public Truck(){

    }
    public Truck(Car car){
    }

    @Override
    public String getIdentity() {
        return null;
    }

    public void go() {

        System.out.println("This is faster than !");
    }

}
