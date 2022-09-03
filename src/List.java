
import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class List {
    public static void main(String[] args) {


        Set<Integer> numbers = new HashSet<>();
        // hash set.  3...3  il supra scrie si cel vechi il sterge
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);


        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Set<String> nume = new HashSet<>(); // nu past ordinea la inserare

        Set<String> nume = new LinkedHashSet<>(); // pastreaza ordinea inserarii

        nume.add("Alex");
        nume.add("George");
        nume.add("Roxana");
        nume.add("pizza");
        nume.add("ceapa");
        nume.add("Alex");


        for (String name : nume) {
            System.out.println(name+" "+name.hashCode());
        }

    }

}
