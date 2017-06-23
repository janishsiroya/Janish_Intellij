package CollectionsFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by janish on 5/28/2017.
 */
public class CursorDemo {
    public static void main(String args[]){
        Vector v =new Vector(); // to find out the classes where the objects of the cursor is created
        Enumeration e = v.elements();
        Iterator i = v.iterator();
        ListIterator litr = v.listIterator();
        System.out.println("Enumeration class = " + e.getClass().getName() + "  Iterator class = " + i.getClass().getName() + "  ListIerator class = " + litr.getClass().getName());
    }
}
