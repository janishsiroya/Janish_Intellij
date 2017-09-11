package JUNIT;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.junit.Assert;

/**
 * Created by janish on 5/1/2017.
 */
public class Assertions {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebElement elem;

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Assert.assertEquals("Facebook - Log In or Sign Up", driver.getTitle());

        Assert.assertTrue(true);
        //WebElement elem = driver.findElement(By.id("email"));
        //elem = driver.findElement(By.xpath("//input[@name= 'firstname']//preceding::input[1]"));
        //driver.findElement(By.xpath("//input[contains( name = firstname, 'First name')]"));
        Boolean b = driver.findElement(By.xpath("//input[@name = 'sex']")).isSelected();
        System.out.println(b);
        File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fs, new File("C:\\Janish\\janish" + ".png"));
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        System.exit(0);
    }
}
