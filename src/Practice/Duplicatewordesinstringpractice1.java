package Practice;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by janish on 8/7/2017.
 */
public class Duplicatewordesinstringpractice1 {
    public static void main(String[] args) {
        String s = "Heloo heloo janish how are you";

        HashMap<String,Integer> h =new HashMap<>();
        String a[]=s.split(" ");
        for (String w:a){
            if(h.containsKey(w.toLowerCase())){
                h.put(w.toLowerCase(),h.get(w.toLowerCase())+1);
            }
            else {
                h.put(w.toLowerCase(),1);
            }
        }
        Set<String> s1 = h.keySet();
        for (String s2:s1){
            if (h.get(s2)>1){
                System.out.println(s2 + h.get(s2));
            }


        }
    }
}
