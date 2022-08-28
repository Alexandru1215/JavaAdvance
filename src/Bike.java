import testeHomeWork.Vehicle;

public class Bike extends Vehicle {


    @Override
    public String getIdentity() {
        return "This is cool";
    }
    @Override
    public void go(){
        System.out.println("This Bike is fast in off-road race!");
    }
}
