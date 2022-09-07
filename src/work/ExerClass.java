package work;

import java.util.*;

public class ExerClass {
    public static void main(String[] args) {


  /*      HashMap<Integer, String> park = new HashMap<>();

        park.put(1, "B123AXR");  // adaugam
        park.put(2, "B512RUN");
        park.put(4, "B125YYY");
        park.put(3, "B152ROA");

        System.out.println(park);


        Set set = park.entrySet();
        System.out.println(set);
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println(me.getKey() + ":");
            System.out.println(me.getValue() + ":");
        }
        Map<Integer, String> park1 = new TreeMap<Integer, String>(park);
        System.out.println(park1);
        System.out.println("After");
        Set set1 = park1.entrySet();
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) ;
        Map.Entry me2 = (Map.Entry) iterator2.next();
        System.out.println(me2.getKey() + ":");
        System.out.println(me2.getValue() + ":");
        System.out.println("before");

    }

    //  Garage car1 = Garage.AUDI;
        //   System.out.println(Garage.AUDI.getModel());
        //    car1 = Garage.BMW;
        //    System.out.println(Garage.BMW.getModel());
        //    car1=Garage.MERCEDES;
        //    System.out.println(Garage.MERCEDES.getModel());


     //   g1.add(Garage.AUDI);
    //    g1.add(Garage.BMW);
     //   g1.add(Garage.FORD);
    //    g1.add(Garage.PEUGEOT);
     //   g1.add(Garage.MERCEDES);

    //    for (Garage gx : g1) {
     ////       System.out.println(gx);
    //    }
      //  try {
          //  Scanner sc = new Scanner(System.in);

  */
        //List<Garage> g1 = new ArrayList<>();
        //Stream.of(Garage.values()).forEach(System.out::println);


        // System.out.println(Garage.values());
        //  Stream.of(Garage.values()).forEach(Stream.builder());


        //    System.out.println("Choose it !");
        //     String garageName = sc.nextLine();
        //     switch (Garage.valueOf(garageName)) {
        //         case PEUGEOT -> System.out.println("Not even close bro!");
        //         case AUDI -> System.out.println("Veni vedi  vici!");
        //        case MERCEDES -> System.out.println("Sport and luxury... Best choice!");
        //           ///case BMW -> System.out.println("YEAHHH! This is a good choice for  you bro!");
        //         default -> System.out.println("Not Yet!");
        //      }
        //    } catch (Exception e) {
        //       System.out.println("See ya' next time!");
        //     }


        HashMap<Integer, String> myLetters = new HashMap<>();
        myLetters.put(8, "R");
        myLetters.put(4, "X");
        myLetters.put(2, "L");
        myLetters.put(5, "A");
        myLetters.put(6, "N");
        myLetters.put(7, "D");
        myLetters.put(9, "U");
        myLetters.put(1, "A");
        myLetters.put(3, "E");
        System.out.println("Before Set");
        System.out.println(myLetters);
        System.out.println("Before Sort!");
        // System.out.println("Nr of elements : " + myLetters.size());
        // System.out.println("If Value is in return true , if is not, return false! " + myLetters.containsValue("A")); //daca valoarea e in lista -  return true.

        // Facem SET apoi bagam Iterator  care are comanda  iterator.hasNext();


        //dupa SET
        System.out.println("With SET and Iterator");
        Set set = myLetters.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.print(me.getKey() + "-");
            System.out.println(me.getValue());
        }
        System.out.println("************************************");
        System.out.println("Iterator cu ArrayList");
        ArrayList<String> nickName = new ArrayList<>();
        nickName.add("Alex");
        nickName.add("Roxana");
        nickName.add("Spartan");
        nickName.add("McDonalds");

        Iterator it = nickName.iterator();

        int count = 0;

        while (it.hasNext()) {
            String names = (String) it.next();
            System.out.print(names + "-");
            System.out.println(count++);
        }
        System.out.println("************************************");
        System.out.println("Iterator cu LinkedSet");
        LinkedHashSet<String> nickN = new LinkedHashSet<>();
        nickN.add("Rox");
        nickN.add("Alex");
        nickN.add("Cris");
        nickN.add("Vali");

        Iterator it2 = nickN.iterator();
        while (it2.hasNext()) {
            String numes = (String) it2.next();
            System.out.print(numes + " - ");
            System.out.println(++count);
        }
        System.out.println("************************************");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);
        numbers.add(8);
        numbers.add(2);
        System.out.println("Fara Iterator TreeSet");
        System.out.print(numbers);
        System.out.println('\n');
        System.out.println("************************************");
        System.out.println("Cu Iterator");

        Iterator it3 = numbers.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            System.out.print(num + " ");
            //System.out.println(count++);
        }
        // System.out.println(count++);
        System.out.println('\n');
        System.out.println("************************************");
        ListIterator<String> listit = null;
        List<String> marvel = new ArrayList<>() ;
        marvel.add("Thor");
        marvel.add("DeadPool");
        marvel.add("Ant-Man");
        marvel.add("SandMan");
        System.out.println("Traversing the list  forward direction.");
        listit = marvel.listIterator();
        while (listit.hasNext()){
            System.out.println(listit.next());
        }
        System.out.println("************************************");
        System.out.println("Traversing the list  backward direction.");
        while (listit.hasPrevious()){
            System.out.println(listit.previous());
        }





    }
}


