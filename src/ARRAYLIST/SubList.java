package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janish on 7/12/2017.
 */
public class SubList {
    public static void main(String[] args) {
        List l =new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(4);


        List al =l.subList(2,5);
        System.out.println(al);
    }
}
