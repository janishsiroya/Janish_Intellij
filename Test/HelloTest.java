import TestSuiteJunit.Helloworld;
import org.junit.Assert;
import org.junit.*;

/**
 * Created by janish on 6/4/2017.
 */
public class HelloTest {
    Helloworld h;
    @Before
    public void init(){
        h = new Helloworld();
    }
    @Test
    public void testHello(){
        Assert.assertEquals("Output is correct","Hello", h.hello());
    }


}
