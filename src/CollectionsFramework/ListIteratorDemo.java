package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by janish on 5/28/2017.
 */
public class ListIteratorDemo {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("E");
        ll.add("D");
        ll.add("C");
        ll.add("B");
        System.out.println("LinkedList = "+ ll);

        ListIterator litr = ll.listIterator(); //creation of listIterator object, only for list collection
        while (litr.hasNext()) //use of hasNext(), next(), add(), set(), remove()
        {
            String s = (String)litr.next();
            if(s.equals("A")) {
                litr.set("Z");
            }
            if(s.equals("B")) {
                litr.remove();
            }
            if (s.equals("C")) {
                litr.add("P");
            }
        }
        System.out.println(ll);
    }
}
