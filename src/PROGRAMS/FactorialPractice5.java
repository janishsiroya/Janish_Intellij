package PROGRAMS;

/**
 * Created by janish on 8/13/2017.
 */
public class FactorialPractice5 {
    static int fac=1;
    static int factorial(int num1){
        if(num1==1){
            return 1;
        }
        else {
            return (num1 * factorial(num1 -1));
        }
    }

    public static void main(String[] args) {

        fac = factorial(5);
        System.out.println(fac);
//        while (num>0){
//            fac = fac *num;
//            num--;
//        }
//        System.out.println(fac);
    }
}
