package Flexton;
import java.util.HashMap;
/**
 * Created by janish on 6/10/2017.
 */
public class StringConcatUnique {
    public static void main(String[] args) {
        String str1 = "abdc23$%123";
        String str2 = "frged456*7adb43";

        char[] chararray1 = str1.toCharArray();
        char[] chararray2 = str2.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c:chararray1){
            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);
        }
        for (char c:chararray2){
            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);
        }
        StringBuilder sb = new StringBuilder();
        for (char key:hashMap.keySet()){
            if(hashMap.get(key)==1) {
                sb.append(key);
            }
        }
        System.out.println(sb);
    }
}
