package HashmapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by janish on 6/15/2017.
 */
public class SynchronizedHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h =new HashMap<>();

        //synchronize hashmap
        Map<Integer,Integer> m = Collections.synchronizedMap(h);
    }
}
