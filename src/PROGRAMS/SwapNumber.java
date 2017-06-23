package PROGRAMS;

/**
 * Created by janish on 5/30/2017.
 */
public class SwapNumber {
    public static void main(String args[]){
        int a = 10;
        int b = 3;
        System.out.println("Number Before swap a = " + a + "  Number = " + b);
        int c = a+b;
        a = c-a;
        b = c-b;
        System.out.println("Number after swap a = " + a + "  Number = " + b);
    }
}
