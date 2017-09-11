package Practice;
import java.util.Scanner;
/**
 * Created by janish on 8/6/2017.
 */
public class PalindromePracticeString {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p="";
        for (int i=s.length()-1; i>=0;i--){
            p=p + s.charAt(i);
        }
        if(s.equals(p)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }

    }
}
