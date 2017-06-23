package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
public class Staticconstructor extends Staticdemo {
    public Staticconstructor()
    {
        System.out.println("Constructor of staticconstructor class");
    }
    public void display()
    {
        System.out.println("Display method");
    }
    public static void main(String args[])
    {
        Staticconstructor obj = new Staticconstructor();
        obj.display();
        //Staticdemo sd = new Staticdemo();
    }
}

class Staticdemo
{
    public Staticdemo()
    {
        System.out.println("Constructor of staticdemo class");
    }

}
