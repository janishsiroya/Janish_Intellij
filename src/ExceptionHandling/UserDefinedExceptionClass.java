package ExceptionHandling;

/**
 * Created by janish on 5/29/2017.
 */
public class UserDefinedExceptionClass {
    public static void main(String args[])
    {
        int i=5;
        try {
            if(i<10) {
                throw new MyException("Errorrrrrrr"); //creating our own exception
            }
            System.out.println(i);
        }
        catch (Exception e) //over here also you can write (MyException e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg); //to get the error message printed
    }
}

