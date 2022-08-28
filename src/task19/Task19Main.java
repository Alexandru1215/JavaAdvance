package task19;

public class Task19Main {

    public static void main(String[] args) {
        Author1 eminescu = new Author1();
        eminescu.setNationality("Romana");
        eminescu.setSurname("Eminescu");


        Poem poem = new Poem(eminescu, 4);
        Author1 creanga = new Author1("Creanga", "Necunoscur");
        Author1 bacovia = new Author1("Bacovia", "Grec");
        Poem poem1 = new Poem(creanga, 7);
        Poem poem2 = new Poem();
        poem2.setCreator(bacovia);
        poem2.setStropheNumbers(3);

        Poem[] poems = new Poem[3];
        poems[0] = poem;
        poems[1] = poem1;
        poems[2] = poem2;

        Author1 toDisplay = new Author1();
        int longestPoem = Integer.MIN_VALUE;


        for (int i = 0; i < poems.length; i++) {
            if (poems[i].getStropheNumbers() > longestPoem) {
                toDisplay = poems[i].getCreator();
                longestPoem=poems[i].getStropheNumbers();
            }

        }
        System.out.println("Autorul cu cel mai mare poem este " + toDisplay.getSurname());

    }
}
