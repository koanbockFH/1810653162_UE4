package at.ac.fhkufstein;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufgabe_5
{
    public static void main(String[] args)
    {
        List<Paperbook> bookList = new ArrayList<Paperbook>();
        bookList.add(new Paperbook(12, new Date(), "My PaperBook 1", "GameOfThrones"));
        bookList.add(new Paperbook(23, new Date(), "My PaperBook 2", "HarryPotter"));
        bookList.add(new Paperbook(34, new Date(), "My PaperBook 3", "HerrDerRinge"));
        bookList.add(new Paperbook(45, new Date(), "My PaperBook 4", "Simpsons"));
        bookList.add(new Paperbook(56, new Date(), "My PaperBook 5", "Futurama"));

        for (Paperbook book:bookList)
        {
            System.out.println(String.format("%s hat %d Seiten und folgende ISBN: %s zusätzlich ist es im Monat %s",
                    book.getTitle(), book.getPages(), book.getIsbn(), book.getMonth()));
        }
    }
}
