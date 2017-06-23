package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
public class Staticclass {
    static class Hello
    {
        static String s = "Hello Janish";
    }
    public static void main(String args[])
    {
        Hello.s ="Hello janish in static class";
        System.out.println(Hello.s);
    }
}
