package PROGRAMS;

/**
 * Created by janish on 5/31/2017.
 */
public class StringCharactersUnique {
    public static boolean uniqueCharacter(String s)
    {
        boolean unique =false;
        if (s.length()>128)
            return false;
        boolean[] char_set = new boolean[128];
        for (int i=0; i<s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(uniqueCharacter("janish"));
    }
}
