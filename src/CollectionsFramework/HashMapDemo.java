package CollectionsFramework;

import java.util.*;

/**
 * Created by janish on 5/28/2017.
 */
public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer, String> h = new HashMap<>();
        h.put(5,"Ram");h.put(2,"Sam");h.put(3,"Ham");h.put(4, null);
        h.remove(4);
        System.out.println(h.size());
        System.out.println("HashMap is= " + h);
        for (Map.Entry m:h.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        Iterator<Integer> itr = h.keySet().iterator();
        while (itr.hasNext()){
            Integer key = itr.next();
            System.out.println("key: " + key + " value: " + h.get(key));
        }
        System.out.println("Size of hashmap = " + h.size());
        System.out.println("Contains value in hashmap = " + h.containsValue("Ham"));
        System.out.println("Contains key in hashmap = " + h.containsKey(4));
        System.out.println("Is Hashmap empty = " + h.isEmpty());

        TreeMap sm = new TreeMap(h);
        System.out.println("Sorted = " + sm);

        System.out.println(Collections.synchronizedMap(h));



    }
}
