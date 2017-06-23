package Practice;
/**
 * Created by janish on 5/4/2017.
 */
public class Fibonnaci_practice {
    static int p = 0, q = 1, r = 0;

    static void fibo(int a) {
        if (a>0) {
            r = q+p;
            p = q;
            q = r;
            System.out.print( " " + r);
            fibo(a-1);
        }
    }
    public static void main(String args[]) {
        //Fibonnaci_practice fp = new Fibonnaci_practice();
        System.out.print(p + " " +q);
        fibo(5);
    }
}
