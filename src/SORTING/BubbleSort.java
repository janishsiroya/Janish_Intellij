package SORTING;
import java.util.Scanner;
/**
 * Created by janish on 3/25/2017.
 */
public class BubbleSort {
    public static void main(String args[]) {
        int array[] = {4, 1, 5, 2, 6, 3};
        bubbleSort(array);
        System.out.println("Array after bubblesort");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
        private static void bubbleSort(int[] array)
    {
        int length = array.length;
        int temp = 0;
        for(int i=0; i<length; i++)
        {
            for (int j = 1; j < (length - i); j++)
            {
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
