package Practice;

/**
 * Created by janish on 8/6/2017.
 */
public class PalindromePractice {
    public static void main(String[] args) {
        int num = 121;
        int rev =0;
        int a=0;
        int temp;
        temp =num;
        while (num>0){
            a = num%10;
            rev = rev * 10 + a;
            num=num/10;
        }
 //       System.out.print(rev);

        if (rev==temp){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
