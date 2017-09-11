package HashmapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by janish on 7/10/2017.
 */

//How to create a static map?
//The problem with the static map is that the objects can be added in the map once the static map is created
public class StaticImmutableMap {
    private static final Map map;
    static {
        Map aMap = new HashMap();
        aMap.put(1, "one");
        aMap.put(2, "two");
        map = Collections.unmodifiableMap(aMap);
    }
    private static final Map m;
    static {
        m = new HashMap();
        m.put(1, "one");
        m.put(2, "two");
    }

    public static void main(String[] args) {
        //StaticImmutableMap.map.put(3,"Three"); I cannot add anything in map as I have made it unmodifiableMap

        Set<Map.Entry<Integer,String>> s = m.entrySet();
        for (Map.Entry<Integer,String> e:s) {
            System.out.println(e.getValue() + ", " + e.getKey());
        }
    }
}
