package Practice;

/**
 * Created by janish on 8/12/2017.
 */
public class AnagramPractice5 {
    public static void main(String[] args) {
        String s1 = "janish";
        String s2 = "janish";
        int a = s1.length();
        int b = s2.length();
        boolean flag =false;
        if (a==b){
            for (int i=0;i<a;i++){
                for (int j=0; j<b;j++){
                    if (s1.charAt(i)==s2.charAt(j)){
                        flag = true;
                    }
                    else {
                        flag = false;
                    }
                }
            }
        }
        if(flag){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }
}
