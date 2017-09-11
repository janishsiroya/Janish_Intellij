package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class RemoveElementsAL {
    public static void main(String[] args) {


        List<Integer> al = Arrays.asList(1,2,3,4,5,6);

        List<Integer> l =new ArrayList<>();
        l.add(1);
        l.add(2);
        System.out.println(l.remove(1));
        System.out.println(l);
        System.out.println(l.remove(new Integer(1)));
        System.out.println(l);

        //System.out.print(Collections.reverse(l));
    }
}
