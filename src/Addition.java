/**
 * Created by janish on 3/24/2017.
 */
public class Addition {
    int a = 10;
    int b = 25;
    int c;
    public void display(int f, int z)
    {
        a = f;
        b = z;
        c = a+b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        Addition add = new Addition();
        add.display(25, 14);
    }
}
