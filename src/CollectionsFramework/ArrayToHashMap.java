package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by janish on 5/30/2017.
 */
public class ArrayToHashMap {
    public static void main(String args[]){
        int a[] = new int[]{1,2,3,4,5};
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i=0; i<a.length; i++) {
            h.put(1,a[i]);
            System.out.println(h);
        }
        //System.out.println(h);

    }
}
