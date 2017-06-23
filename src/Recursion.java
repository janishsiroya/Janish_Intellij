/**
 * Created by janish on 4/23/2017.
 */
public class Recursion
    {
        static int count = 0;
    static void janish()
    {
        count++;
        if (count<=5) {
            System.out.println("Recursion");
            janish();
        }
    }
    int a = 0;
    public void janish1()
    {
        a++;
        if (a<=5)
        {
            System.out.println("Recursion in public method");
            janish1();
        }
    }

    public static void main(String args[])
    {
        janish();
        Recursion r = new Recursion();
        r.janish1();
    }
}
