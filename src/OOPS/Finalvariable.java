package OOPS;

/**
 * Created by janish on 3/19/2017.
 */
public class Finalvariable {
    final int a = 25;
    void display()
    {
        //a = 100; // this will throw a compilation error as you cannot change the value of final variable once initialized
    }

    public static void main(String args[])
    {
        final int i = 10;
        System.out.println(i);
        Finalvariable f = new Finalvariable();
        f.display();
    }
}
