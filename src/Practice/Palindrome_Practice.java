package Practice;

import java.util.Scanner;

/**
 * Created by janish on 5/4/2017.
 */
public class Palindrome_Practice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        String s = sc.nextLine();

        String p ="";

        for(int i= s.length()-1;i>=0; i-- )
            p = p + s.charAt(i);

        if (s.equals(p))
            System.out.println("String is palindrome");
        else
            System.out.println("String not palindrome");


//        if(p==s)
//            return;
    }
}
