package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by janish on 5/29/2017.
 */
public class TryResource {
    public static void main(String args[])throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s = "";
            s = br.readLine();
        }
    }
}
