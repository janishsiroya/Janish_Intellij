package ExceptionHandling;

/**
 * Created by janish on 5/29/2017.
 */
public class ExceptionDemo {
    public static void main(String agrs[]){
        int arr[]= new int[4];
        int i,j,k=0;
        i=8;
        j=2;
        try
        {
            k=i/j;
            for (int a=0; a<=4; a++){
                arr[a] = a+1;
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e) //multiple catch with one try block
        {
            System.out.println("Maximum limit reached");
        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        System.out.println(k);
    }
}
