package ARRAYLIST;
//creating array in one line
import CollectionsFramework.Array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class OneLineListCreation {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        int b[] = new int[5];

        //CREATING LIST IN ONE LINE
        List<String> al = Arrays.asList("a","b");
        System.out.println(al);
    }
}
