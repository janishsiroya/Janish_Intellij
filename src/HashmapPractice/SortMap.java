package HashmapPractice;
import java.util.*;
/**
 * Created by janish on 7/10/2017.
 */
public class SortMap {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 22);
        m.put(13, 14);
        m.put(5, 6);

        //sorting the map using TREEMAP
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(m);
        Set<Map.Entry<Integer, Integer>> s = map.entrySet();
        for (Map.Entry e : s) {
            System.out.println(e.getKey() + "," + e.getValue());
        }

        //sorting the map based on values


    }
}