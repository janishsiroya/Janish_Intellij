package PROGRAMS;

/**
 * Created by janish on 4/23/2017.
 */
public class FibonacciRecursion {
    static int n1 = 0,n2 = 1,n3 = 0;

    static void fibo(int p) {
        if (p > 0) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibo(p-1);
        }
    }
    public static void main(String args[])
    {
        //int p=10;
        System.out.print(n1 + " " + n2);
        fibo(4);
    }
}
