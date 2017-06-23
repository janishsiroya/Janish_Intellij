package JUNIT;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by janish on 4/19/2017.
 */
public class TestJunit {
    public void testadd()
    {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
