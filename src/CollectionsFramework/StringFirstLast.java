package CollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by janish on 5/28/2017.
 */
public class StringFirstLast {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string");
        String s = sc.nextLine();
        String[] parts = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i < parts.length-1; i++){
            sb.append(parts[i]);
        }
        String s2 = parts[parts.length-1];

        System.out.println("FirstName = " + sb.toString() + " " + "LastName = "+ s2);

    }
}
