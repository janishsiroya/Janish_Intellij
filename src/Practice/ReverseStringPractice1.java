package Practice;

/**
 * Created by janish on 8/12/2017.
 */
public class ReverseStringPractice1 {
    public static void main(String[] args) {
        String s = "janish";
        String r="";

        for (int i=s.length()-1; i>=0;i--){
            r = r + s.charAt(i);
        }
        System.out.println("Reverse string using for loop = "+ r);

        StringBuilder sb = new StringBuilder();
        sb = sb.append(s);
        System.out.println(sb);
        //sb.reverse();
        System.out.println("Reverse string using reverse method = " + sb);

        for (int i=sb.length()-1; i>=0; i--){
            System.out.print(sb.charAt(i));
        }
    }
}
