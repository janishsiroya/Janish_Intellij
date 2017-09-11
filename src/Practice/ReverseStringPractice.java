package Practice;

/**
 * Created by janish on 8/6/2017.
 */
public class ReverseStringPractice {
    public static void main(String[] args) {
        String s = "janish";
        char c[] = s.toCharArray();
        int l = c.length;
        StringBuilder sb =new StringBuilder();
        String reverse ="";
        for (int i=l-1; i>=0; i--){
         //   System.out.print(sb.append(c[i]));
            System.out.print(c[i]);
        }
        sb.append(s);
        System.out.println(sb);
        sb=sb.reverse();

        System.out.println(sb);
        for (int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i));
        }
    }
}
