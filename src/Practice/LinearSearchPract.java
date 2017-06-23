package Practice;

import java.util.Scanner;

/**
 * Created by janish on 3/26/2017.
 */
public class LinearSearchPract {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
         System.out.println("Enter the elements in array");
         int arr[]= new int[len];
         for (int i=0; i<len; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println("Enter the item to be searched");
         int search = sc.nextInt();
         boolean flag = false;
         for (int i=0; i<len; i++) {
             if(search ==arr[i]) {
                 flag = true;
                 break;
             }
         }
         if(flag)
             System.out.print("Element" + search + "found");
         else
             System.out.println("Element not found");

    }
}
