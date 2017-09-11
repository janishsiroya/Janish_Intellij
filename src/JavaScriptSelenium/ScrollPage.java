package JavaScriptSelenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/**
 * Created by janish on 7/8/2017.
 */
public class ScrollPage {
        public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://jqueryui.com");
            Thread.sleep(5000);
            // This  will scroll page 400 pixel vertical
            ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        }
}
