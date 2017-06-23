package OOPS;

public class Staticmethod
{
    static int i;
    static String s;
    static void display()
    {
        Staticmethod sm = new Staticmethod();
        System.out.println(sm.i);
    }
    public static void main(String args[])
    {
        display();
    }
}