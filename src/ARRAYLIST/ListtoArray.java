package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class ListtoArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);

        Integer[] a = new Integer[numbers.size()];
        a = numbers.toArray(a);
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
