package Practice;

/**
 * Created by janish on 4/13/2017.
 */
public class OVerloadingPractice {
    public void janish(int a)
    {
        System.out.println(a);
    }
    public void janish(int a, int b)
    {
        System.out.println(a + b);
    }
    public static void main(String args[])
    {
        OVerloadingPractice a = new OVerloadingPractice();
        a.janish(5);
        a.janish(3,4);
    }


}
