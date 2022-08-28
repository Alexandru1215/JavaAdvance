package task19;

public class Author1 {

    private String surname;
    private String nationality;

    public Author1() {
    }

    Author1(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}

