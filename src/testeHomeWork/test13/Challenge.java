package testeHomeWork.test13;

public class Challenge {
    public static String concatName(String firstName, String lastName) {
        //return (lastName + ", " + firstName);
        return String.format("%s, %s", lastName, firstName);
    }
}