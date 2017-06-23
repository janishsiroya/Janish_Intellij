package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by janish on 5/11/2017.
 */
public class CharactersWordsLinesInFilePractice {
    public static void main(String args[])
    {
        BufferedReader reader = null;
        int charcount = 0;
        int wordcount = 0;
        int linecount = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Janish\\Sample.txt"));
            String currentLine = reader.readLine();

            while (currentLine!=null)
            {
                linecount++;
                String[] words = currentLine.split(" ");
                wordcount = wordcount + words.length;

                for(String word: words)
                {
                    charcount = charcount + word.length();
                }
                currentLine= reader.readLine();

            }
            System.out.println("Number Of Chars In A File : "+charcount);

            System.out.println("Number Of Words In A File : "+wordcount);

            System.out.println("Number Of Lines In A File : "+linecount);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
