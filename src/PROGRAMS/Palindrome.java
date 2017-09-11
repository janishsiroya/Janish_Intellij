package PROGRAMS;
import java.util.Scanner;
/**
 * Created by janish on 4/21/2017.
 */
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String reverse = "";
        int len = s.length();

        for(int i=len-1; i>=0; i--)
            reverse = reverse + s.charAt(i);
        if(s.equals(reverse))
            System.out.println("Entered String is palindrome");
        else
            System.out.println("Entered string is not a palindrome.");
    }
}
