package Flexton;

/**
 * Created by janish on 6/9/2017.
 */
public class Stringreplaceinteger {
    public String stringAbbrev (String s){
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int lengthMin2 = length - 2 ;
        sb.append(lengthMin2);
        sb.append(s.charAt(length-1));
        return sb.toString();
    }
    public static void main(String[] args) {
        String test = "hello";
        Stringreplaceinteger s = new Stringreplaceinteger();
        System.out.println(s.stringAbbrev(test));
    }

}
