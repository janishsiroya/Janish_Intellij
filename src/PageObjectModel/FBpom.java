package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by janish on 7/9/2017.
 */
public class FBpom {

    WebDriver driver;

    public FBpom(WebDriver driver){
        this.driver=driver;
    }
    By username = By.id("user_login");
    By password = By.id("user_pass");
    By login=By.name("wp-submit");

    public void loginToWordpress(String userid,String pass)
    {

        driver.findElement(username).sendKeys(userid);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(login).click();
    }
//
//    public void enterUsername(){
//        driver.findElement(username).sendKeys("admin");
//    }
//    public void enterPassword(){
//        driver.findElement(password).sendKeys("demo123");
//    }
//    public void clickLogin(){
//        driver.findElement(login).click();
//    }
}

