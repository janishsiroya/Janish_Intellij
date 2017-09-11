package Practice;

/**
 * Created by janish on 8/6/2017.
 */
public class ReveresNumberPractice {
    public static void main(String[] args) {
        int num=54611115;
        int reverse =0;

        while (num!=0){
            int a = num%10;
            reverse = reverse*10 + a;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
