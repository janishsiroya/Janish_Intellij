package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class ReverseAL {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList();
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(1);
        Collections.reverse(al);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(al.lastIndexOf(1));
        int[] a=new int[6];


    }
}
