import TestSuiteJunit.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by janish on 6/4/2017.
 */
public class CalculatorTest {
    Calculator c;
    @Before
    public void init(){
        c = new Calculator();
    }

    @Test
    public void testAddition() {
        Assert.assertEquals("Error in addition", 3, Calculator.addition(1,2));
    }
}
