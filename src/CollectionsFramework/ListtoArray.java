package CollectionsFramework;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by janish on 7/10/2017.
 */
public class ListtoArray {
    public static void main(String[] args) {
        List<String> al = new ArrayList();
        al.add("jansih");
        al.add("janish1");
        al.add("janish3");
        al.add("jansih4");

        String arr[] = new String[al.size()];
        for (int i=0;i<al.size(); i++){
            arr[i] = al.get(i);
        }
        for (int i=0;i <arr.length; i++){
            System.out.println(arr[i]);
        }

        //String[] array = ArrayUtils.toPrimitive(al.toArray(new String[0]));

    }
}
