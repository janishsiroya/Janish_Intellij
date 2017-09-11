package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class ArraylistDemo {
    public static void main(String args[])
    {
        //ArrayList al = new ArrayList(); //default constructor with predifined size of 10
        //ArrayList al = new ArrayList(20); // constructor with initial size defined as 20
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add(5);
        ArrayList al = new ArrayList(ll); // constructor to convert given collection into equivalent arraylist
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println(al.get(2)); //retrieval
        System.out.println(al);

    }
}
