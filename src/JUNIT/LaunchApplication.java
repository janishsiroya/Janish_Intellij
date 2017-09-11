package JUNIT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by janish on 5/1/2017.
 */
public class LaunchApplication {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        //logger.info("Facebook launched successfully");
        WebElement elem = driver.findElement(By.id("email"));
        elem.sendKeys("janishsiroya@yahoo.com");
//        driver.get("https://www.yahoo.com");
//
//        Set<String> allWindows = driver.getWindowHandles();
//        Iterator<String>  allWindow= allWindows.iterator();
//        System.out.println(allWindow);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();
        System.exit(0);
    }
}
