package PROGRAMS;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by janish on 5/30/2017.
 */
public class CommonElementTwoArrays {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {4, 5, 6, 7, 1, 2, 3};
        int l1 = a.length;
        int l2 = b.length;
        for (int i = 0; i < l1; i++)
            for (int j = 0; j < l2; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        HashSet<String> h = new HashSet<String>();
        String s1[] = {"a", "b", "c"};
        String s2[] = {"r", "h", "b"};
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    h.add(s1[i]);
                }
            }
        }
        //System.out.println(h);
        Iterator itr = h.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
