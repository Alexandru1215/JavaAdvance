package testeHomeWork.buggyCode5;

import java.util.*;

public class Mubashir {
    public static  List PrintArray(int number)
    {
        List array = new ArrayList<>();

        for(int count = 1; count <= number;)
        {

            array.add(count++);
        }

        return array;
    }
}