package JUNIT;
// No need to locate/find the submit button
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by janish on 7/15/2017.
 */
public class Check {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        // Locate the searchbox using its name
        WebElement element = driver.findElement(By.id("lst-ib"));

        // Enter a search query
        element.sendKeys("Guru99");

        // Submit the query. Webdriver searches for the form using the text input element automatically
        // No need to locate/find the submit button
        element.submit();
    }
}