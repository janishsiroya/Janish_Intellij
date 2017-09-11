//CONTAINS, FOLLOWING, TEXT METHOD

package JUNIT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by janish on 5/2/2017.
 */
public class Xpath_contains_method {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebElement elem;
        driver.get("http://demosite.center/wordpress/wp-login.php");
        elem = driver.findElement(By.xpath("//input[@id = 'user_login']"));
        elem.sendKeys("admin");
        elem = driver.findElement(By.xpath("//input[@name='pwd']"));
        elem.sendKeys("demo123");
        elem = driver.findElement(By.xpath("//input[@type = 'submit']"));
        elem.sendKeys(Keys.ENTER);
        //elem = driver.findElement(By.xpath("//a[contains(text(),'dcdc']"));
        //xpath using contains method
        elem = driver.findElement(By.xpath("//a[contains(@href,'edit.php')][text() = 'Posts']"));

        //following is used to use the next element after the text discussion on the page
        elem = driver.findElement(By.xpath("//*[text() = 'Discussion']//following::a[contains(@href,'edit.php')][text() = 'Posts']"));
        //elem = driver.findElement(By.xpath("//*[text() = Discussion]//following:: a[contains(text(), 'xyz')][contains(text(),'Posts'"));
        elem = driver.findElement(By.xpath("//a[contains(text(),'Please update now')]"));

        System.out.println(driver.getCurrentUrl());
        System.out.println(elem);

        //driver.close();
        System.exit(0);


    }
}