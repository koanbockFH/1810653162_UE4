package at.ac.fhkufstein;

import java.util.Date;

public class Aufgabe_3
{
    public static void main(String[] args)
    {
       Book myFirstBook = new Book(50, new Date(), "GameOfThrones", "123");

        System.out.println(String.format("Das Buch hat %d Seiten, wurde am %tc veröffentlicht und hat den Titel %s",
                myFirstBook.getPages(), myFirstBook.getReleased(), myFirstBook.getTitle()));
    }
}
