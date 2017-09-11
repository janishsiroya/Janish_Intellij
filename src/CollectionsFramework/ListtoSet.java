package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 7/10/2017.
 */
public class ListtoSet {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList();
        al.add(3);
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(2);
        Collections.sort(al);

        for(Integer k:al){
            System.out.println("Using enhanced for loop = " + k);
        }

        //using ADDALL method
        Set s1 = new HashSet(al);
        s1.addAll(al);

        Iterator i = s1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

            //passing into constructor
        Set s = new HashSet(al);
        //s.addAll(al);

        Iterator i1 = s.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        //using linked hashset to maintain order
        Set lhs = new LinkedHashSet(al);
        System.out.println(lhs);
    }
}
