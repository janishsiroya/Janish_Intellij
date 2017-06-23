package Flexton;

/**
 * Created by janish on 6/14/2017.
 */
public class ArraySameOddEven {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 4, 6, 7};
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 == 0) {
                i++;
            } else {
                if (a[j] % 2 == 0) {
                    int temp;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                } else {
                    j--;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
