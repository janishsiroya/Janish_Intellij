package PROGRAMS;
import java.io.*;
/**
 * Created by janish on 5/11/2017.
 */
public class CharactersWordsLinesInFile {
    public static void main(String args[]) throws IOException {
        BufferedReader br = null;
        int charcount =0, wordcount=0, linecount=0;
        try {
            br = new BufferedReader(new FileReader("demo.txt"));
            String currentline = br.readLine();
            while (currentline!=null)
            {
                linecount++;
                String[] words = currentline.split(" ");
                wordcount = wordcount + words.length;
                for (String word: words)
                {
                    charcount = charcount + word.length();
                }
                currentline = br.readLine();
                System.out.println("Number Of Chars In A File : "+charcount);

                System.out.println("Number Of Words In A File : "+wordcount);

                System.out.println("Number Of Lines In A File : "+linecount);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            }
            catch (IOException e)
            {
                System.out.println("IO Exception");
            }
        }

    }
}