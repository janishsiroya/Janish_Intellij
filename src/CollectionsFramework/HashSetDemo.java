package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class HashSetDemo {
    public static void main(String []args){
        //HashSet h =new HashSet(); // default with initial size 16
        //HashSet h =new HashSet(1);
        Set<String> h =new HashSet<String>(20,0.90f);
        h.add("Z");
        System.out.println(h.add("Z"));
        h.add(null);
        h.add("A");h.add("m");h.add("n");h.add("b");h.add("v");h.add("x");h.add("z");
        h.add("u");h.add("j");h.add("k");h.add("l");h.add("Abb");
        h.add("y");
        h.add("t");
        h.add("r");
        h.add("e");
        h.add("d");
        h.add(null);
        System.out.println(h);


    }
}
