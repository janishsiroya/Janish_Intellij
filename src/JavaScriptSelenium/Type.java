package JavaScriptSelenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by janish on 7/8/2017.
 */
public class Type {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");

    // This will execute JavaScript in your script
    ((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='mukesh';");
        ((JavascriptExecutor)driver).executeScript("document.getElementById('pass').value='mukesh123';");
    }
}
