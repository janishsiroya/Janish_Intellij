package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
class Staticblock {
    static int i;
    static String s;
    static {
        i=2;
        s = "Anubhuti";
    }
    static {
        i=22;
        s = "AAAAAAnubhuti";
    }
    public static void main(String args[])
    {
        System.out.println(i);
        System.out.println(s);
    }
}
