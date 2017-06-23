package Practice;

import java.util.Scanner;

/**
 * Created by janish on 5/4/2017.
 */
public class AnagramPractice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string in anagram");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string in anagram");
        String s2 = sc.nextLine();
        int a =s1.length();
        int b = s2.length();
        boolean flag = false;
        if(a == b)
        {
            for (int i=0; i<a; i ++ )
                for (int j=0; j<b; j++)
                    if (s1.charAt(i) == s2.charAt(j))
                        flag = true;
        }
        else
            flag = false;
        if (flag)
            System.out.println("Strings are anagram");
        else
            System.out.println("Strings are not anagram");

    }
}
