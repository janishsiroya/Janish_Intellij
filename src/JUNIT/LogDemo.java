package JUNIT;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by janish on 5/8/2017.
 */
public class LogDemo {
    public static void main(String args[])
    {
        Logger logger = Logger.getLogger("LogDemo");
        PropertyConfigurator.configure("Log4j.properties");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        logger.info("Facebook launched successfully");
        WebElement elem = driver.findElement(By.id("email"));
        elem.sendKeys("janishsiroya@yahoo.com");
        logger.info("Webelement not found");


        System.exit(0);
    }
}
