package Practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * Created by janish on 8/12/2017.
 */
public class DuplicateCharactersString {

        public void duplicatescharacters(String sj) {
            Map<Character, Integer> h = new HashMap<Character,Integer>();
            char[] c = sj.toCharArray();
            for (Character c1:c) {
                if (h.containsKey(c1)) {
                    h.put(c1, h.get(c1) + 1);
                } else {
                    h.put(c1, 1);
                }
            }
            Set<Character> set = h.keySet();
            for (Character c2:set) {
                if (h.get(c2) > 1) {
                    System.out.println(c2 + "=" + h.get(c2));
                }
            }
        }
    public static void main(String[] args) {
            DuplicateCharactersString d = new DuplicateCharactersString();
            d.duplicatescharacters("jana  jana");
        }

}
