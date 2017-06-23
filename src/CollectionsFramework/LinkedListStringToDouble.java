package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by janish on 5/31/2017.
 */
public class LinkedListStringToDouble {
    public static void main(String args[]){
        LinkedList<Integer> ll =new LinkedList<>();
        for (int i=0; i <5;i++)
        {
            ll.add(i);
        }
        System.out.println(ll);
        ListIterator itr = ll.listIterator();
        while (itr.hasNext())
            Double.parseDouble(String.valueOf("janish"));
            System.out.println(itr.next());
    }
}
