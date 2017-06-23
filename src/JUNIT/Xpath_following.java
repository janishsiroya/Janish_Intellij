package JUNIT;
import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by janish on 5/2/2017.
 */
public class Xpath_following {
    public static void main(String args[]) {


        WebDriver driver;
        WebElement elem;

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demosite.center/wordpress/wp-login.php");
        elem = driver.findElement(By.xpath("//input[@id = 'user_login']"));
        elem.sendKeys("admin");
        elem = driver.findElement(By.xpath("//input[@name='pwd']"));
        elem.sendKeys("demo123");
        elem = driver.findElement(By.xpath("//input[@type = 'submit']"));
        elem.sendKeys(Keys.ENTER);


        //FOLLOWING
        elem = driver.findElement(By.xpath("//*[@id='content-label']/label//following::input[1]"));

        //ANCESTOR
        elem = driver.findElement(By.xpath("//*[@id = 'welcome-panel']/div[1]//ancestor::div[4]"));

        System.exit(0);


    }
}
