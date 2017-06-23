package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by janish on 5/31/2017.
 */
public class ArrayListSort {
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        al.add(100);
        al.add(25);
        al.sort(Integer::compareTo);
        System.out.println(al);

        Collections.sort(al);
        System.out.println("Ascending = " + al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Descending = " + al);
    }
}
