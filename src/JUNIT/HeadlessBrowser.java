package JUNIT;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javax.swing.text.html.HTML;

/**
 * Created by janish on 5/3/2017.
 */
public class HeadlessBrowser {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        HtmlUnitDriver driver = new HtmlUnitDriver(true);
        driver.setJavascriptEnabled(false);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }
}
