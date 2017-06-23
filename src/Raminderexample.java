/**
 * Created by janish on 3/17/2017.
 */
class A
{
    public A()
    {
        System.out.println("Constructor of class A");
    }
}
class B extends A{
    public B(){
        System.out.println("B constt");
    }
}
public class Raminderexample  {

    public static void main(String args[])
    {
        A obj = new A(); //constructor of class A
        //B bObj = new B();// constructor of class A, B constt

    }

}

