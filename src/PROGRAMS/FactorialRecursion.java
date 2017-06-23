package PROGRAMS;

/**
 * Created by janish on 4/23/2017.
 */
public class FactorialRecursion {
    public int factorial(int f)
    {
        if(f==1)
            return 1;
        else
            return (f*factorial(f-1));
        //System.out.println(fac);
    }

    public static void main(String args[])
    {
        //System.out.println(factorial(5));
        FactorialRecursion f = new FactorialRecursion();
        //f.factorial(5);
        System.out.println(f.factorial(5));

    }
}
