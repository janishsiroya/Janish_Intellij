package JUNIT;
import junit.framework.TestCase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by janish on 5/2/2017.
 */
public class Xpath_single_wordpress {
    public static void main(String args[]) {


        WebDriver driver;
        WebElement elem;

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://demosite.center/wordpress/wp-login.php");
        elem = driver.findElement(By.xpath("//input[@id = 'user_login']"));
        elem.sendKeys("janish");
        elem = driver.findElement(By.xpath("//input[@name='pwd']"));
        elem.sendKeys("janish@123");
        elem = driver.findElement(By.xpath("//input[@type = 'submit']"));
        elem.sendKeys(Keys.ENTER);
        //to check if checkbox is enabled
        Boolean enable = driver.findElement(By.xpath("//input[@name= 'rememberme']")).isEnabled();
        //to check is checkbox is displayed
        Boolean display = driver.findElement(By.xpath("//input[@name= 'rememberme']")).isDisplayed();
        System.out.println(enable);
        System.out.println(display);
        //to check if checkbox is

        Boolean selected= driver.findElement(By.xpath("//input[@name= 'rememberme']")).isSelected();
        System.out.println(selected);
        //to check if text is visible
        driver.findElement(By.xpath("//a[@title = 'Powered by Xpath_single_wordpress']"));
        //Select sel = new Select(driver.findElement(By.xpath("//inpt[@id= 'rememberme']")));
        //sel.selectByValue("forever");
        System.exit(0);


    }
}
