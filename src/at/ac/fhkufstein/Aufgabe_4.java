package at.ac.fhkufstein;

import java.util.*;

public class Aufgabe_4
{
    public static void main(String[] args)
    {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(12, new Date(), "My Book 1", "123"));
        bookList.add(new Book(23, new Date(), "My Book 2", "456"));
        bookList.add(new Book(34, new Date(), "My Book 3", "678"));
        bookList.add(new Book(45, new Date(), "My Book 4", "890"));
        bookList.add(new Book(56, new Date(), "My Book 5", "000"));

        for (Book book:bookList)
        {
            System.out.println(String.format("%s hat %d Seiten und folgende ISBN: %s", book.getTitle(),
                    book.getPages(), book.getIsbn()));
        }
    }
}
