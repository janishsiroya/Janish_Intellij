package FileHandling;

/**
 * Created by janish on 5/29/2017.
 */
import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main (String args[])
    {
        try
        {
            File file = new File("C:\\Janish\\janish.txt");
            boolean b= file.createNewFile(); //CreateNewFile - method to create a file
            if(b)
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File not created");
            }
        }
        catch (IOException e)
        {
            System.out.println("Exception occured");
        }
    }
}
