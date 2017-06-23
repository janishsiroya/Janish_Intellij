package CollectionsFramework;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Set;

/**
 * Created by janish on 5/28/2017.
 */
public class MapDemo {
    public static void main(String args[])
    {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "A");
        m.put(2,"B");
        for (Map.Entry m1:m.entrySet())
            System.out.println(m1.getKey() + " " + m1.getValue());
        Set<Integer> keys = m.keySet();
        for (Integer i:keys)
        {
            System.out.println("All keys = " + m.get(i));
        }
    }
}
