package DataStructures;
import java.util.*;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * Created by janish on 4/24/2017.
 */
public class LinkedList1 {
    public static void main(String args[])
    {
        LinkedList<String> l = new LinkedList<String>();
         l.add("Janish");
        l.add("Abhishek");
        l.addFirst("Khushi");
        l.pop();
        l.pop();
        Iterator<String> itr=l.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

