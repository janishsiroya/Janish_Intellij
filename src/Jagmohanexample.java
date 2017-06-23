/**
 * Created by janish on 3/18/2017.
 */
public class Jagmohanexample extends PArent{
    int x = 40;
    public void show()
    {
        System.out.print(((PArent)this).x); // multi level inheritance
    }
    public static void main(String args[])
    {
        //Grandparent g = new Grandparent();
        //System.out.print(g.x);
        //PArent p = new PArent();
        Jagmohanexample j = new Jagmohanexample();
        j.show();
    }
}
class Grandparent
{
    int x = 20;
}
class PArent extends Grandparent
{
    int x = 30;

}

