package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
/**
 * Created by janish on 7/9/2017.
 */
public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){
        if(browserName.equalsIgnoreCase("IE")){
            driver = new InternetExplorerDriver();
        }
        if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        if(browserName.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }


}
