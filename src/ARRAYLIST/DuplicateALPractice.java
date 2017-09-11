package ARRAYLIST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by janish on 7/28/2017.
 */
public class DuplicateALPractice {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("1");
        al.add("1");
        al.add("2");
        al.add("1");
        al.add("3");
        al.add("3");
        al.add("4");
        al.add("2");
        System.out.println("Orignial al : " + al);
        System.out.println(duplciateslist(al));

    }
    public static Set<String> duplciateslist(List<String> dup){
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        for(String s: dup){
            if(!s1.add(s)){
                s2.add(s);
            }
        }
        return s2;
    }
}
