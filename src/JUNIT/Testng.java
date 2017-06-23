package JUNIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by janish on 5/12/2017.
 */
public class Testng {

    public WebDriver driver;
    public WebElement elem;
    //= new ChromeDriver();
    @Test
    public void verifyTitle()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        String title = driver.getTitle();
//        String expected = "Google";
//        Assert.assertEquals(title, expected);
        driver.close();
    }
}
