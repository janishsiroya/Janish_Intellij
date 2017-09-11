package Practice;

/**
 * Created by janish on 8/6/2017.
 */
public class AnagramPRactice1 {
    public static void main(String[] args) {
        String s1 = "janish";
        String s2 = "janish";
        int l1 = s1.length();
        int l2 = s2.length();
        Boolean b = false;
        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    if(s1.charAt(i)==s2.charAt(j))
                    {
                        b = true;
                    }
                }
            }
        }
        else {
            b=false;
        }
        if(b){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }
}
