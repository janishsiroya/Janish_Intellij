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

        // Creating a new instance of the HTML unit driver
        WebDriver driver= new HtmlUnitDriver();
        driver.get("http://www.google.com");

//         //Locate the searchbox using its name
//        WebElement element = driver.findElement(By.id("lst-ib"));
//
//         //Enter a search query
//        element.sendKeys("Guru99");
//
//         //Submit the query. Webdriver searches for the form using the text input element automatically
//         //No need to locate/find the submit button
//        element.submit();
//
//         //This code will print the page title
//        System.out.println("Page title is: " + driver.getTitle());
//
//        driver.quit();
    }
}