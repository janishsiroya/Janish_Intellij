//NAVIGATION
// GETATTRIBUTE

package JUNIT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import junit.framework.TestCase;

public class Navigation{

    public static void main(String args[]) {
// objects and variables instantiation
        WebDriver driver;
        WebElement elem;
        //@Before
        //public void setUp()
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //@Test
        //public void test_login()
        driver.get("https://accounts.google.com");
        elem = driver.findElement(By.xpath("//input[@type ='email']"));
        //***********************************************************************************
        String s = driver.findElement(By.xpath("//input[@type ='email']")).getAttribute("name");
        //***********************************************************************************
        System.out.println(s);
        elem.sendKeys("ajaysanchela1@gmail.com");
        elem.sendKeys(Keys.RETURN);
        //***********************************************************************************
        //driver.navigate().back();
        //***********************************************************************************
        System.out.println("Test script executed successfully.");
        //@After
        //public void tearDown()
        //driver.close();
        System.exit(0);

    }
}
