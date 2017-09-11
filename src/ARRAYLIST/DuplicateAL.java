package ARRAYLIST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by janish on 7/28/2017.
 */
public class DuplicateAL {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 9; i++) {
            al.add(String.valueOf(i));
        }

        for (int i = 0; i < 5; i++) {
            al.add(String.valueOf(i));
        }
        System.out.println(al);
        System.out.println("Filtered duplicates : " + processList(al));
    }
        public static Set<String> processList(List<String> duplicates){
            final Set<String> resultset = new HashSet<>();
            final Set<String> tempset = new HashSet<>();

            for (String s: duplicates){
                if (!tempset.add(s)){
                    resultset.add(s);
                }

            }
            return resultset;
    }
}
