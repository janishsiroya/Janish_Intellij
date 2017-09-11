package Practice;

/**
 * Created by janish on 8/12/2017.
 */
public class FibonnaciPRactice5 {

    static int a = 0;
    static int b = 1;
    static int c = 0;

    static void fibo(int f) {
        if(f>0) {
        c = b + a;
        a = b;
        b = c;
        System.out.print(" " + c);
        fibo(f-1);
    }
}

    public static void main(String[] args) {

        System.out.print(a +" "+b);
        fibo(7);
    }
}
