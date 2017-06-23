package CollectionsFramework;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class LinkedHashset {
    public static void main(String args[]) {
        //LinkedHashset lh = new LinkedHashset();
        Set<String> s = new LinkedHashSet<String>();
        s.add("A");
        s.add("C");
        s.add("B");
        s.add(null);
        System.out.println(s);
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
