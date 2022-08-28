public class MathWork {


    private double area;
    private double perimetre;


    MathWork() {

    }

    public void calculateAreaOfCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle [radius = " + radius + "]:" + area);
    }

    public void calculatePerimetreOfRectangle(double lenght, double width) {
        double perimetre = 2 * (lenght * width);
        System.out.println("Perimetre of rectangle is : " + perimetre);
    }

    public void calculateAreaOfRectangle(double lenght, double width) {
        double area = lenght * width;
        System.out.println("Area of a rectangle is : "+area);
    }
}