package PROGRAMS;

/**
 * Created by janish on 6/12/2017.
 */
public class ArrayOddEven {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 4, 6, 7};
        int output[] = new int[6];
        int len = output.length;
        int even = 0;
        int odd = 3;
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                //System.out.println(a[i]);
                output[even] = a[i];
                even++;
            }
            else {
                output[odd] = a[i];
                odd++;
            }
        }
        for (int i =0;i<len; i++) {
            System.out.println(output[i]);
        }

        }
    }
