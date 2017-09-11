package PageObjectModel;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by janish on 7/9/2017.
 */
public class LoginWordPressNew {
    @Test
    public void checkValidUser(){
        // This will launch browser and specific url
        WebDriver driver = BrowserFactory.startBrowser("Chrome","http://demosite.center/wordpress/wp-login.php");
        // Created Page Object using Page Factory
        FBpomPageFactory login_page = PageFactory.initElements(driver,FBpomPageFactory.class);

        // Call the method
        login_page.login_wordpress("admin", "demo123");


    }
}
