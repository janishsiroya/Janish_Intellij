package Practice;

/**
 * Created by janish on 4/13/2017.
 */
public class OverridingPractice extends Overriding1 {
    public void overriding12()
    {
        System.out.println("I am in parent class");
        super.overriding12();
    }
    public  static void main(String args[])
    {
        OverridingPractice o =new OverridingPractice();
        o.overriding12();
        Overriding1 o1 = new Overriding1();
        o1.overriding12();
    }
}

class Overriding1
{
    public void overriding12()
    {
        System.out.println("Child class");
    }
}
