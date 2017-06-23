package PROGRAMS;

/**
 * Created by janish on 6/12/2017.
 */
public class ReverseString {
    public void revstring(String s){
        s.length();
        char[] c= s.toCharArray();
        //StringBuilder sb =new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            //sb.append();
            System.out.println(c[i]);
        }
    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        r.revstring("janish");
    }
}
