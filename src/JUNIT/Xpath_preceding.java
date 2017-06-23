package JUNIT;
import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by janish on 5/2/2017.
 */
public class Xpath_preceding {
    public static void main(String args[]) {


        WebDriver driver;
        WebElement elem;

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demosite.center/wordpress/wp-login.php");
        elem = driver.findElement(By.xpath("//label[text() ='Username']//following::input[1]"));
        elem = driver.findElement(By.xpath("//*[@id='wp-submit']//preceding::input[1]"));
        System.exit(0);


    }
}
