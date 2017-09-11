package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by janish on 7/9/2017.
 */
public class LoginWordPress {
        @Test
        public void verifyValidLogin(){
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demosite.center/wordpress/wp-login.php");

            FBpom f = new FBpom(driver);
//        f.enterUsername();
//        f.enterPassword();
//        f.clickLogin();
            f.loginToWordpress("admin", "demo123");
            driver.quit();
    }
}