package OOPS;

/**
 * Created by janish on 3/16/2017.
 */
public class Overloading {
    public static void main(String args[])
    {
        Methodoverloading m = new Methodoverloading();
        m.first(10);
        m.first(10, 40);
    }
}

class Methodoverloading
{
    public void first(int a)
    {
        System.out.println(a);
    }
    public void first(int a, int num)
    {
        System.out.println(a + num);
    }
}
