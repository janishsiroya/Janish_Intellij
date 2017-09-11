package JUNIT;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by janish on 7/14/2017.
 */
public class FailSSPRactice {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void failSS() throws Exception {
        driver.get("https://www.gmail.com");
        driver.findElement(By.id("randomid"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                File fs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(fs, new File("C:\\janish\\failsspractice" + result.getName() + ".png"));
                System.out.println("Screenshot captured successfully");
            } catch (Exception e) {
                System.out.println("Exception while taking screenshot");
            }
        }
        driver.quit();
    }
}

