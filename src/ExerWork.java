import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExerWork {
    public static void main(String[] args) {

        List<Grocery>  groceryList = new ArrayList<>();

        groceryList.add(Grocery.FRIDGE);
        groceryList.add(Grocery.TV);
        groceryList.add(Grocery.FRIDGE);
        groceryList.add(Grocery.ESPRESSO_MACHINE);

        int sum =0 ;

            for(Grocery item : groceryList){
                sum+= item.price;

            }
        System.out.println(sum);








    }


}
