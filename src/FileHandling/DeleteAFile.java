package FileHandling;
/**
 * Created by janish on 5/29/2017.
 */
import java.io.File;
import java.io.IOException;

public class DeleteAFile {
    public static void main(String args[])
    {
        try
        {
            File file=new File("C:\\Janish\\janish.txt"); //just specify the path fo existing file
            if(file.delete()) //use of delete method
            {
                System.out.println(file.getName() + "File deleted");
            }
            else
            {
                System.out.println("File not deleted");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception handling");
        }
    }
}
