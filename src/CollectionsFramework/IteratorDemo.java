package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by janish on 5/28/2017.
 */
public class IteratorDemo {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println("My arraylist = " + al);
        Iterator itr = al.iterator(); // creating iterator object
        while (itr.hasNext()) //use of hasNext() and next() and remove()
        {
            Integer I = (Integer) itr.next();
            if (I > 4) {
                System.out.println(I);
            }
        }
        itr.remove(); // removes last element by default
        System.out.println("After using remove() = " + al);
    }
}