package at.ac.fhkufstein;

import java.util.Calendar;
import java.util.Date;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        c.set(2018,9,02,14,9,54);
        Book myFirstBook = new Book(50, c.getTime(), "GameOfThrones", "123");

        System.out.println(String.format("Das Buch hat %d Seiten, wurde am %tc veröffentlicht und hat den Titel %s",
                myFirstBook.getPages(), myFirstBook.getReleased(), myFirstBook.getTitle()));
    }
}
