package testeHomeWork.test2;

public class test2 {
    public static int convert(int hours, int minutes) {
//The time in seconds is equal to the hours multiplied by 3,600.
        //hours * minutes
        // int seconds = hours * 3600;
        //return  ;
        int ht = hours * 60 * 60;
        int mt = minutes * 60;
        return ht + mt;
    }


}