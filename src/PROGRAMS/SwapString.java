package PROGRAMS;

/**
 * Created by janish on 5/30/2017.
 */
public class SwapString {
    public static void main(String args[]){
        String s1 = "Janish";
        String s2 = "Raminder";
        s1 = s1 + s2;
        System.out.println(s1);
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("String s2 = " + s2 + "  String s1 = " + s1);
    }
}
