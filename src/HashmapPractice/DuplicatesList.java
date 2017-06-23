package HashmapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by janish on 6/19/2017.
 */
public class DuplicatesList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("janish");
        al.add("janish");
        al.add("janish1");
        al.add("janish");
        al.add("janish1");
        al.add("janish");
        al.add("janish2");
        al.add("janish2");al.add("janish4");
        al.add("janish");
        al.add("janish3");
        System.out.println(al);

        HashMap<String,Integer> h= new HashMap<>();

        Iterator i = al.iterator();
        while (i.hasNext()){
            String s=(String)i.next();


            if (h.containsKey(s)) {
                h.put(s, h.get(s) + 1);
            }
            else {
                h.put(s,1);
            }
                System.out.println(s);
        }
        System.out.println(h);



        //Iterator
    }
}
