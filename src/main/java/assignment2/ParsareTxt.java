package assignment2;

import java.util.ArrayList;
import java.util.List;

public class ParsareTxt {

    public static void main(String[] args) {

        String text = "John.Davidson/05082004/Belgrade Michael.Barton/01011998/Krakov Ivan.Perkinson/23051986/Moscow";

        List<Person> personList = new ArrayList<>();

        String[] textArray = text.split(" ");

        Person person =null;

        for (String textArray1 : textArray) {

            textArray1 = textArray1.replace(".", " ").replace("/", " ");

            personList.add(person);

            System.out.println(textArray1);
        }
    }
}


/*public String getperson() {
        return myList.toString();

    }*/


