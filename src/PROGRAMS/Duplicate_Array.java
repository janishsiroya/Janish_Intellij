package PROGRAMS;

/**
 * Created by janish on 5/4/2017.
 */
public class Duplicate_Array {
    //int a[] = new int[5];
    int a[] = {1,2,4,5,4,2};

    public int[] duplicate()
    {
        int count=0;
        int b[] = new int[2];
        for(int i =0;i <a.length; i++)
            for (int j= i+1; j<a.length;j++)
            {
                if (a[i] == a[j])
                {
                    b[count] = a[i];
                    count++;

                }
            }
            return b;
    }
    public static void main(String args[])
    {
        Duplicate_Array d = new Duplicate_Array();
        //System.out.println(d.duplicate());
        int y[]= d.duplicate();
        for (int i=0;i <y.length; i++)
        {
            System.out.println(y[i]);
        }

    }
}
