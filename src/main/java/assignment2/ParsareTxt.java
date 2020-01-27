package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsareTxt {

    public static void main(String[] args) {

        String text = "John.Davidson/05082004/Belgrade Michael.Barton/01011998/Krakov Ivan.Perkinson/23051986/Moscow";

        List<Person> personList = new ArrayList<>();

        String[] textArray = text.split(" ");

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        for (String textData : textArray) {

            String [] personalData = textData.split("/");

            String [] name = personalData[0].split("\\.");

            Person person = new Person(name[0], name[1], LocalDate.parse(personalData[1], formatter), personalData[2]);

            personList.add(person);
            
        }
        System.out.println(personList); 
    }
}




