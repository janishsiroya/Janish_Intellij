package OOPS;

/**
 * Created by janish on 3/19/2017.
 */
public class Finalblankvariable {
    final int b;

    Finalblankvariable()
    {
        b = 100; //final variable must be initialized in a constructor if not initialized while declaration
    }

    void mymethod()
    {
        System.out.println(b);
    }

    public static void main(String args[])
    {
        Finalblankvariable fb = new Finalblankvariable();
        fb.mymethod();
    }
}
