import java.util.Scanner;
/**
 * Created by janish on 3/24/2017.
 */
public class ReverseANumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int a = sc.nextInt();

        int reverse = 0;
        while(a!=0)
        {
            int num = a % 10;
            reverse = reverse*10 + num;
            a = a / 10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
