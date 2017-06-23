package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;

/**
 * Created by janish on 5/29/2017.
 */
public class IOExceptionDemo {
    public static void main(String args[]){
        int i=8,j=1,k=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of j");

        try {
            j=Integer.parseInt(br.readLine());
            k = i/j;
            System.out.println(k);
        }
        catch (IOException e){
            System.out.println("Some wrong input");
        }
        catch (ArithmeticException e)//required if user enters j value as 0
        {
            System.out.println("Value of j cannot be 0");
        }
        catch (Exception e){
            System.out.println("Some unknown exception");
        }
        finally //this block wil always be executed. so I wanted to print BYE after the code is executed any how. So writing about
                //sometime won't print if there is any other exception or etc. So to avoid REDUNDANT LINE OF CODES
        {
            System.out.println("BYE");
        }

    }
}
