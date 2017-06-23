package HashmapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by janish on 6/15/2017.
 */
public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(1,2);
        h.put(4,5);
        System.out.println(h);

        Iterator<Integer> i = h.keySet().iterator();
        while (i.hasNext()){
            Integer key= i.next();
            System.out.println("Keys = " + key + " Values = " + h.get(key));
        }

        //Using map interface
        for (Map.Entry m:h.entrySet()){
            System.out.println("Displaying key value using entry interface" + "\n" + "Key = " + m.getKey() + " Value = " + m.getValue());
        }

        //using set & entrySet
        Set<Map.Entry<Integer,Integer>> s = h.entrySet();
        for (Map.Entry<Integer,Integer> m: s){
            System.out.println("Displaying key value using set & entry" + "\n" + "Key = " + m.getKey() + " Value = " + m.getValue());
        }
    }
}
