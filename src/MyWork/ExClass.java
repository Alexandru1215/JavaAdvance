package MyWork;

import java.util.*;

public class ExClass {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 1, 7, 5, 12);
        numbers.sort(Comparator.comparingInt(x2 -> x2));  //compara 2 numere

        numbers.sort((x1, x2) -> x1 - x2); // compara numerele .. diferenta lor. la fel ca sus.

        int x = 11;

        for (int i = 0; i < numbers.size(); i++) {
            for (Integer number : numbers) {
                if (numbers.get(i) + number == x) {
                    System.out.println("I found");
                }
            }
        }

        Set<Integer> numbersFound = new HashSet<>();

        for (Integer number : numbers) {
            if (numbersFound.contains(number)) {  // numarul dat il compar cu numar gasit .
                System.out.println("found  it");
            } else {
                numbersFound.add(x - number); // x-ul se scade din numarul gasit la comparatia cu nr dat
            }

        }
    }
}
