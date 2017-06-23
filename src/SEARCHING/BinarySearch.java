package SEARCHING;

import java.util.Scanner;

/**
 * Created by janish on 3/25/2017.
 */
public class BinarySearch {
    public static void main(String args[])
    {
        int first,last,middle,search,len;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the items of array in sorted format");
        for(int i=0; i<len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        search = sc.nextInt();
        //middle = (arr[first] + last)/2;
        first = 0;
        last = len-1;
        middle = (first + last) / 2;
        while ((first <= last))
        {
            if (arr[middle]<search)
                first = middle + 1;
                else if(arr[middle] ==search)
            {
                System.out.println("Element" + search + "found at position"  + (middle+1));
                break;
            }
            else
                last = middle-1;
                middle = (first+last)/2;
        }
        if(first>last)
            System.out.println(search + "is not present in the list");
            sc.close();
    }
}
