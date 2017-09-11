package CollectionsFramework;

import org.testng.ITestResult;

import java.util.*;

/**
 * Created by janish on 7/11/2017.
 */
public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap();
        hm.put(1,2);
        hm.put(45,100);
        hm.put(23,65);

        Iterator i = hm.keySet().iterator();
        while (i.hasNext()){
            Integer e = (Integer)i.next();
            System.out.println(e + ","  + hm.get(e));
        }

        Set<Map.Entry<Integer,Integer>> s = hm.entrySet();
        for (Map.Entry m:s){
            System.out.println(m.getKey() + "," + m.getValue());
        }

        for(Map.Entry<Integer,Integer> a : hm.entrySet()){
            System.out.println(a.getKey() + "," + a.getValue());
        }
    }
}
