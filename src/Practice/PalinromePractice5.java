package Practice;

/**
 * Created by janish on 8/12/2017.
 */
public class PalinromePractice5 {
    public static void main(String[] args) {
        String s = "janaj";
        String rev ="";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(s);
        System.out.println(sb);
        if(s.equals(String.valueOf(sb))){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
