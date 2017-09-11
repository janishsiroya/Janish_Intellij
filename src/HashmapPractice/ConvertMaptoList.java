package HashmapPractice;

import java.util.*;

/**
 * Created by janish on 7/10/2017.
 */
public class ConvertMaptoList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("janish");
        al.add("janish1");
        al.add("janish2");

        //iterating list & printing
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            }

        //creating hashmap
        Map<Integer, String> m = new HashMap();
        m.put(1,"anubhuti");
        m.put(2,"anubhuti1");
        m.put(3,"anubhuti2");

        //printing hashmap using map.entry interface
        for (Map.Entry e:m.entrySet()){
            System.out.println("Using Map Entry interface = " + e.getKey() + "," + e.getValue());
        }

        //printing hashmap using iterator
        Iterator itr1 = m.keySet().iterator();
        while (itr1.hasNext()){
            Integer key = (Integer) itr1.next();
            System.out.println("Using iterator = " + key+"," + m.get(key));
        }

        //printing hashmap using Set
        Set <Map.Entry<Integer,String>> s = m.entrySet();
        for (Map.Entry m1:s){
            System.out.println("USing Set = " + m1.getKey() + "," + m1.getValue());
        }

        //converting map into list //entryset //keyset //values
        List l = new ArrayList(m.entrySet());
        System.out.println(l);
        Iterator i = l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
