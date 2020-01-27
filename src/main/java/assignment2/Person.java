package assignment2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    String prenume;
    String nume;
    LocalDate DataNasterii;
    String LoculNasterii;

    public Person(String prenume, String nume, LocalDate DataNasterii, String LoculNasterii) {

        this.prenume = prenume;
        this.nume = nume;
        this.DataNasterii = DataNasterii;
        this.LoculNasterii = LoculNasterii;

    }

    @Override

    public String toString() {

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy");

        return "\n prenume: " + prenume +" nume: "+ nume + " data nasterii: " + DataNasterii.format(formatter1) + " locul nasterii: " + LoculNasterii;

    }

}
