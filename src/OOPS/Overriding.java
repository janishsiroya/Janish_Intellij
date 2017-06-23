package OOPS;

/**
 * Created by janish on 3/16/2017.
 */
public class Overriding extends Methodoverriding {
    public void math()
    {
        System.out.print("MAth is more than a subject");
    }
    public static void main (String args[])
    {
        Overriding o = new Overriding();
        o.math();
        Methodoverriding m= new Methodoverriding();
        m.math();
    }
}

class Methodoverriding
{
    public void math()
    {
        System.out.println("Math is a subject");
    }
}