package JUNIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
/**
 * Created by janish on 7/9/2017.
 */
public class FBDropdown {
        public static void main(String args[]) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
            // First we have to click on menu item then only dropdown items will display
            driver.findElement(By.xpath(".//*[@id='menu1']")).click();
            //driver.findElement(By.xpath(".//*[@id='month']")).click();
            // adding 2 seconds wait to avoid Sync issue
            Thread.sleep(2000);
            // Dropdown items are coming in <a> tag so below xpath will get all
            // elements and findElements will return list of WebElements
            List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
            //List<WebElement> list = driver.findElements(By.xpath("//option[@class='dropdown-menu']//li/a"));
            // We are using enhanced for loop to get the elements
            for (WebElement ele : list) {
                // for every elements it will print the name using innerHTML
                System.out.println("Values " + ele.getAttribute("innerHTML"));
                // Here we will verify if link (item) is equal to Java Script
                if (ele.getAttribute("innerHTML").contains("JavaScript")) {
                    // if yes then click on link (iteam)
                    ele.click();
                    // break the loop or come out of loop
                    break;
                }
            }
        }
}
//            driver.get("https://www.facebook.com");
//            //logger.info("Facebook launched successfully");
//            WebElement elem = driver.findElement(By.id("email"));
//            elem.sendKeys("janishsiroya@yahoo.com");
////        driver.get("https://www.yahoo.com");
////
////        Set<String> allWindows = driver.getWindowHandles();
////        Iterator<String>  allWindow= allWindows.iterator();
////        System.out.println(allWindow);
//            System.out.println(driver.getCurrentUrl());
//            driver.close();
//            driver.quit();
//            System.exit(0);
//        }
//    }
