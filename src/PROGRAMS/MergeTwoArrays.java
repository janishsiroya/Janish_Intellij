package PROGRAMS;

/**
 * Created by janish on 5/4/2017.
 */
public class MergeTwoArrays {
    public static void main(String args[]) {

        int a[] = {9, 4, 1, 12};
        int b[] = {5, 3, 15};
        int al = a.length;
        int bl = b.length;
        int c = al + bl;
        int m[] = new int[c];
            int k=0;

            for(int i=0; i<al; i++) {
                m[i] = a[i];
                k++;
            }
            for(int j=0; j<bl; j++) {
                m[k++]= b[j];
            }
            for (int i=0;i<m.length; i++) {
                System.out.println(m[i] + " ");
            }
    }
}
