package Practice;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by janish on 8/12/2017.
 */
public class Duplicatewordsinstringpractice5 {
    public static void main(String[] args) {
        String s ="hello janish hello jansih";
        String [] word = s.split(" ");

        HashMap<String, Integer> h = new HashMap<>();
        for (String w :word) {
            if (h.containsKey(w)) {
                h.put(w.toLowerCase(), h.get(w.toLowerCase()) + 1);
            } else {
                h.put(w.toLowerCase(), 1);
            }
        }

        Set<String> s1 = h.keySet();
        for (String str : s1){
            if (h.get(str) >1){
                System.out.println("Count of " + str + " is " + h.get(str));
            }
        }
    }
}
