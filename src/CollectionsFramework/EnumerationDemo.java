package CollectionsFramework;

import java.util.Enumeration;
import java.util.Vector;
/**
 * Created by janish on 5/28/2017.
 */
public class EnumerationDemo {
    public static void main(String args[]) {
        Vector v =new Vector(); //enumeration is only for legacy classes
        for (int i=0;i<=10; i++)
            v.add(i);
        System.out.println("My vector = " + v);

        Enumeration e = v.elements(); // to create enumeration object using elements method
        while (e.hasMoreElements()) // use of hasMoreElements() and nextElement()
            {
            Integer i =(Integer)e.nextElement();
            if(i%2 ==0)
                System.out.println(i);
        }
        System.out.println(v);
    }
}
