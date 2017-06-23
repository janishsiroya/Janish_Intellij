package DataStructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by janish on 4/24/2017.
 */
public class LinkedListBook {
    public static void main(String args[]) {
        Book b1 = new Book("Half girlfriend", 123, 500, "Chetan Bhagat");
        List<Book> l= new LinkedList<Book>();
        l.add(b1);
        for(Book b:l) {
            System.out.println(b.bookid + b.bookname+ b.bookpages + b.bookauthor);
        }
    }
}

class Book{
    String bookname;
    int bookid;
    int bookpages;
    String bookauthor;

    public Book(String n, int id, int p, String a)
    {
        this.bookname = n;
        this.bookid = id;
        this.bookpages = p;
        this.bookauthor = a;
    }
}
