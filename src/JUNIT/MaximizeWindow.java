package JUNIT;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import junit.framework.TestCase;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class MaximizeWindow{

    public static void main(String args[]) throws IOException {
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
        System.out.println(driver.manage().window().getPosition().getX());
        System.out.println(driver.manage().window().getPosition().getY());
        System.out.println(driver.manage().window().getPosition());

        //***********************************************************************************8
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition().getX());
        System.out.println(driver.manage().window().getPosition().getY());
        //***********************************************************************************8
        elem = driver.findElement(By.xpath("//input[@type ='email']"));
        elem.sendKeys("siroyajanish@gmail.com");
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f,new File( "C:\\Janish\\maximizewindow" + ".png"));
        System.out.println("Test script executed successfully.");
        //@After
        //public void tearDown()
        //driver.close();
        System.exit(0);

    }
}
