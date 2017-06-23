//package JUNIT;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.AfterClass;
//import junit.framework.TestCase;
//import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.interactions.Actions;
////import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import javax.swing.*;
//import java.util.Iterator;
//import java.util.Set;
//
//public class GmailLogin extends TestCase{
//
//    public static void main(String args[]) {
//// objects and variables instantiation
//        WebDriver driver;
//        WebElement elem;
//        @Before
//        public void setUp()
//            System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
//            driver = new ChromeDriver();
//        @Test
//        public void test_login()
//            driver.get("https://accounts.google.com");
//            elem = driver.findElement(By.xpath("//input[@type ='email']"));
//            Actions act = new Actions(driver);
//            elem.sendKeys("siroyajanish@gmail.com");
//            //elem.sendKeys("siroyajanish@gmail.com");
//            System.out.println(driver.findElement(By.tagName("a")).size());
//
//            System.out.println("Test script executed successfully.");
//        @After
//        public void tearDown()
//            //driver.close();
//            System.exit(0);
//
//    }
//}
