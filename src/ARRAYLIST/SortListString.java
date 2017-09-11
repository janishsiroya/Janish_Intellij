package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by janish on 7/28/2017.
 */
public class SortListString {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add("Jan");
        al.add("Feb");
        al.add("March");

        String[] s = {"Jan","Man","Fan"};
        Arrays.sort(s);
        System.out.println(s);
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
            al.add(s[i]);
        }
        Iterator i = al.iterator();
        while (i.hasNext()){
            System.out.println("Inside arraylist  " + i.next());
        }



    }
}
