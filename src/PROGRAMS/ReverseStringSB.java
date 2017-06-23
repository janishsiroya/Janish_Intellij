package PROGRAMS;

/**
 * Created by janish on 6/12/2017.
 */
public class ReverseStringSB {
    public static void main(String args[]){
        String input = "janish";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        System.out.println(sb);
        sb = sb.reverse();
        for (int i=0;i<sb.length();i++)
            System.out.print(sb.charAt(i));
    }
}
