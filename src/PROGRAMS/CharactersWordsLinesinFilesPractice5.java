package PROGRAMS;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by janish on 8/13/2017.
 */
public class CharactersWordsLinesinFilesPractice5 {
    public static void main(String[] args) throws Exception {
        int l = 0, w = 0, c = 0;
        BufferedReader b = null;
        b = new BufferedReader(new FileReader("demo.txt"));
        String bl = b.readLine();
        while (bl != null) {
            l = l + 1;
        String[] words = bl.split(" ");
        w = w + words.length;
        for (String chars : words) {
            c = c + chars.length();
        }
        System.out.println(l);
        System.out.println(w);
        System.out.println(c);
        bl = b.readLine();
    }
    }
}
