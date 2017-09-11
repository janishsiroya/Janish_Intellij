package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class CopyCollection {
    public static void main(String[] args) {
        List a= new ArrayList();
        a.add(1);
        a.add(2);

        List b = new ArrayList(a.size());
        Collections.copy(a,b);
        System.out.println(b);

        Iterator i=b.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



    }
}
