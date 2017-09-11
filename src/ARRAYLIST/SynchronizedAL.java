package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by janish on 7/11/2017.
 */
public class SynchronizedAL {
    public static void main(String[] args) {
        List al = Collections.synchronizedList(new ArrayList<>());
        //al.add( )

        List al1 = new ArrayList();

        al1 = Collections.synchronizedList(al1);
    }
}
