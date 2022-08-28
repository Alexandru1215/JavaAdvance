package task19;

public class Poem {


    private Author1 creator;
    private int stropheNumbers;

    public Poem() {

    }

    public Poem(Author1 creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author1 getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setCreator(Author1 creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
