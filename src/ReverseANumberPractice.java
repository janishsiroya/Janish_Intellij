/**
 * Created by janish on 7/28/2017.
 */
public class ReverseANumberPractice {
    public static void main(String[] args) {
        int num = 324;
        ReverseANumberPractice r = new ReverseANumberPractice();
        System.out.println(r.reversenumber(455555));
        System.out.println(r.reversenumber(num));
}
    public int reversenumber(int num) {
        int rev=0;
        while (num != 0) {
            rev = num % 10 + rev * 10;
            num = num / 10;
        }return rev;
    }
}
