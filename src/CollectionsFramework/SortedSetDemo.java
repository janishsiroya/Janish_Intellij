package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class SortedSetDemo {
    public static void main(String args[]) {
        //Set<Integer> s = new SortedHashSet<Integer>();
        SortedSet<String> s = new TreeSet<String>();
        s.add("A");
        s.add("E");
        s.add("D");
        s.add("C");
        s.add("B");
        System.out.println("First = " + s.first());
        System.out.println("Last = " + s.last());
        System.out.println("HEadset = " + s.headSet("D"));
        System.out.println("Tailset = " + s.tailSet("C"));
        System.out.println("Subset = " + s.subSet("A","C"));
        System.out.println("Comparator = " + s.comparator());
        System.out.println(s);
        Iterator itr = s.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
