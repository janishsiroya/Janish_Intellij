package PROGRAMS;

import java.util.Scanner;

/**
 * Created by janish on 3/25/2017.
 */
public class Anagram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 =  sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();
        int l1,l2;
        l1 = s1.length();
        l2 = s2.length();
        boolean flag = true;

        if(l1 == l2)
        {
            for (int i = 0; i<l1; i++)
            {
                for(int j=0; j<l2; j++)
                {
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        flag = true;
                        break;
                    }
                    else
                    {
                        flag = false;
                    }

                }

            }
        }
        else
            flag = false;

        if (flag)
            System.out.println("String is anagram");
        else
            System.out.println("Strings are not anagram");
    }
}
