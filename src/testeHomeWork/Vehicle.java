package testeHomeWork;

public abstract class Vehicle {

    int numbersOfWheels ;
    boolean hasEngine;

    public Vehicle (){
        numbersOfWheels =1;
    }
    public abstract String getIdentity();




    public abstract void go();
}
