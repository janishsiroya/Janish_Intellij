package Practice;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by janish on 5/4/2017.
 */
public class DuplicateWordInStringPractice {
    static void duplicates(String s)
    {
        String[] w = s.split(" ");
        HashMap<String, Integer> wordcount = new HashMap<>();

        for (String word: w) {
            if (wordcount.containsKey(word.toLowerCase())) {
                wordcount.put(word.toLowerCase(), wordcount.get(word.toLowerCase()) + 1);
            } else {
                wordcount.put(word.toLowerCase(), 1);
            }
        }
            Set<String> st = wordcount.keySet();
            for (String word: st)
            {
                if (wordcount.get(word) >1)
                {
                    System.out.println(word + " " + wordcount.get(word));
            }
        }
    }
    public static void main(String[] args) {
        duplicates("Bread butter and bread");
        duplicates("Java is java again java");
        duplicates("Super Man Bat Man Spider Man");
    }
}
