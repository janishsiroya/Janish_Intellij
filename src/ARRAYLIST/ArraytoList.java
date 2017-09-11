package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by janish on 7/10/2017.
 */
public class ArraytoList {
    public static void main(String[] args) {

        Integer a[] = {1, 2, 3, 4};

        List<Integer> l = new ArrayList<>();
        for(int i:a){
            l.add(i);
        }
        System.out.println(l);

        List<Integer> list =new ArrayList<Integer>();
        list= Arrays.asList(a);
        System.out.println(list);

        Integer[] b = {1,2,3,4,5};

        List al = Arrays.asList(1,2,4);
        System.out.println(al);

        List<Integer> ab=new ArrayList<Integer>();
        ab = Arrays.asList(b);
        System.out.println(ab);

        List c = new ArrayList();
        for (Integer k:b){
            c.add(k);
        }
        System.out.println(c);

    }
}
