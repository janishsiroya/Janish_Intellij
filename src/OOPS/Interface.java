package OOPS;

/**
 * Created by janish on 3/18/2017.
 */
public class Interface implements Hello2 {
    public void hello()
    {
        System.out.println("Hello method");
    }
    public void hello1()
    {
        System.out.println("Hello1 method");
    }
    public static void main(String args[])
    {
        Hello2 h = new Interface();
        h.hello();
        h.hello1();
        //Hello2 h1=new Hello2(); // hello2 is abstract hence cannot be instantiated
    }
}

interface Hello2
{
    public void hello();
    public void hello1();
}
