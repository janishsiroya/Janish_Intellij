package PROGRAMS;

import io.netty.channel.sctp.SctpNotificationHandler;

import java.util.Scanner;

/**
 * Created by janish on 5/30/2017.
 */
class Number{
    static boolean numberOrNot(String input) {
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
public class CheckInputInteger{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the mobile number");
        String input = sc.next();
        if(Number.numberOrNot(input) && (input.length() == 10)) {
            System.out.println("Good!!! You have entered valid mobile number");
        }
        else {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }
    }
}
