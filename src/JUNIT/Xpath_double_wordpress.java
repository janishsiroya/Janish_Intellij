package JUNIT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by janish on 5/2/2017.
 */
public class Xpath_double_wordpress {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe  ");

        WebDriver driver = new ChromeDriver();
        WebElement elem;
        driver.get("http://demosite.center/wordpress/wp-login.php");
        //xpath for double elements
        //elem = driver.findElement(By.xpath("//input[@class='input'][@name='log']"));
        elem = driver.findElement(By.xpath("//input[@class='input' and @name='log']"));
        //elem = driver.findElement(By.xpath("//input[@class='input' or @name='log']"));
        driver.getCurrentUrl();
        elem.sendKeys("janish");

     //driver.close();
     System.exit(0);


    }
}