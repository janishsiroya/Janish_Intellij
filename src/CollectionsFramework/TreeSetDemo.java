package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class TreeSetDemo {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        for (int i=10; i>0; i--)
            al.add(i);
        //TreeSet<Integer> t = new TreeSet<Integer>(); // default
        //TreeSet t = new TreeSet(al); //creating equivalent treeset for any collection
        SortedSet st = new TreeSet();
        for(int i =0; i<10; i++)
            st.add(i);
        TreeSet t = new TreeSet(st); // taking sorted set in treeset
        //t.add(1);
        //t.add(null);
        //t.add( );
        System.out.println(t);
        Iterator itr = t.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
