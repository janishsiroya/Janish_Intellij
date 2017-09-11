package JUNIT;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by janish on 5/3/2017.
 */
public class Annotations{
    //public static void main(String args[]) {
    public WebDriver driver;
    @Before
        public void setUp() {
        WebElement elem;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        }

        @Test
        public void verifyTitle() {
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            String expected = "Google";
            Assert.assertEquals(title, expected);
        }
        @After
                public void tearDown() {
            driver.close();
        }
}
//        Assert.assertEquals(actualTitle, expectedTitle);
//        driver.close();
//    }
//}
