package JUNIT;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(JUNIT.ListenerTest.class)

/**
 * Created by janish on 7/15/2017.
 */
public class ListenerLogin {
    WebDriver driver;
    // Test to pass as to verify listeners .
    @Test
    public void Login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        driver.findElement(By.name("btnLogin")).click();
    }
    // Forcefully failed this test as to verify listener.
    @Test
    public void TestToFail() {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
