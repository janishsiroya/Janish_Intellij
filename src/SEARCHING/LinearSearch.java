package SEARCHING;
import java.util.Scanner;
/**
 * Created by janish on 3/25/2017.
 */
public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the array elements");
        for(int i=0; i<num; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int search = sc.nextInt();
        boolean flag = false;

        for(int i = 0; i<num; i++) {
            if (array[i] == search) {
                flag = true;
            }
        }
            if(flag)
            {
                System.out.println("Item found");
            }
            else
            {
                System.out.println("Item not found");
            }
    }
}
