import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by janish on 7/9/2017.
 */
public class PageObjectModelSelenium {
    WebDriver driver;

    public PageObjectModelSelenium(WebDriver driver){
        this.driver=driver;
    }
    By username = By.id("user_login");
    By password = By.id("user_pass");
    By login=By.name("wp-submit");

    public void enterUsername(){
        driver.findElement(username);
    }
    public void enterPassword(){
        driver.findElement(password);
    }
    public void clickLogin(){
        driver.findElement(login);
    }
}
