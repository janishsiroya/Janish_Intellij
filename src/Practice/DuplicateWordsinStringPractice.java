package Practice;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by janish on 8/6/2017.
 */
public class DuplicateWordsinStringPractice {
    static void duplicate(String s){
        HashMap<String,Integer> h =new HashMap<>();
        String w[]= s.split(" ");
        for (String word:w) {
            if (h.containsKey(word.toLowerCase())) {
                h.put(word.toLowerCase(), h.get(word.toLowerCase()) + 1);
            } else {
                h.put(word.toLowerCase(), 1);
            }
        }
            Set<String> set = h.keySet();
            for (String s1:set){
                if (h.get(s1)>1){
                    System.out.println(s1 + " "+ h.get(s1));
                }
            }
        }

    public static void main(String[] args) {
        //duplicate("Hello janish how are you?");
        duplicate("Hello janish. Hello anubhuti");
    }
}
