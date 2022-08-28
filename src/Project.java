public class Project {

    private String fname;
    private String lname;
    private int age;
    private double height;
    private double weight;

    Project(String fname, String lname, int age, double height, double weight) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
