package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
public class Abstract {
    public void display2()
    {
        System.out.println("Abstract method overriden");
    }
    public  static void main(String args[])
    {
        Abstract a = new Abstract();
        //Hello1 h = new Hello1();
            a.display2();
    }
}

abstract class Hello1
{
    public void display1()
    {
        System.out.println("Concrete method of abstract class");
    }
    abstract void display2();

}
