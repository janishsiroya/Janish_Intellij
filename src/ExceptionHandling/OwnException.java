package ExceptionHandling;

/**
 * Created by janish on 5/29/2017.
 */
public class OwnException {
    public static void main(String args[])
    {
        int i=8, j =5, k =0;
        try {
            k=i+j;
            if(k<10)
            {
                throw new Exception(); //creating our own exception
            }
            System.out.println(k);
        }
        catch (Exception e)
        {
            System.out.println("Some exception");
        }
    }
}
