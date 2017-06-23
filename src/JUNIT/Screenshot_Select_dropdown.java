package JUNIT;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.util.List;

/**
 * Created by janish on 5/2/2017.
 */
public class Screenshot_Select_dropdown {
    public static void main(String args[])
    {
        WebDriver driver;
        WebElement elem;
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Sign Up"));
        Select sel = new Select(driver.findElement(By.xpath("//select[@id = 'month']")));
        sel.selectByValue("11");
        List<WebElement> op = sel.getOptions();
        System.out.println(op);
        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
              FileUtils.copyFile(ss, new File("C:\\Janish\\firstss" + ".png"));
        }
        catch (Exception e) {
            System.out.println("Screenshot not captured or path not found");
        }
        System.exit(0);
    }
}
