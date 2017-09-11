package FileHandling;

import PROGRAMS.FibonacciRecursion;
import org.apache.xpath.SourceTree;

import java.io.*;

/**
 * Created by janish on 5/29/2017.
 */
public class FileDemo {
    public static void main(String args[]) throws IOException {
        File f =new File("demo.txt");

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello jan");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String s = dis.readUTF();
        //System.out.println(dis);
        System.out.println(s);
    }
}
