package Flexton;

import java.util.HashMap;

/**
 * Created by janish on 6/14/2017.
 */
public class StringConcatUniquePractice {
    public static void main(String[] args) {
        String s1 = "janish";
        String s2 = "siroya";

        char c1[]=s1.toCharArray();
        char c2[]= s2.toCharArray();

        HashMap<Character,Integer> h = new HashMap<>();

        for (char c: c1) {
            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }

            for (char c: c2) {
                if (h.containsKey(c)) {
                    h.put(c, h.get(c) + 1);
                } else {
                    h.put(c, 1);
                }
            }
        StringBuilder sb = new StringBuilder();
        for (char key:h.keySet()){
            if (h.get(key) ==1){
                sb.append(key);
            }
        }
        System.out.println(sb);
    }
}
