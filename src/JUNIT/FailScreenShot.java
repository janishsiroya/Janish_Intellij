package JUNIT;

// Import all classes and interface
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by janish on 7/10/2017.
 */
public class FailScreenShot {
        // Create Webdriver reference
        WebDriver driver;

        @Test
        public void captureScreenshot() throws Exception {

            System.setProperty("webdriver.chrome.driver","C:\\Selenium_Chromedriver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.facebook.com");
            driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");
        }

        // It will execute after every test execution
        @AfterMethod
        public void tearDown(ITestResult result) {
            // Here will compare if test is failing then only it will enter into if condition
            if(ITestResult.FAILURE==result.getStatus()) {
                try {
                    // Create refernce of TakesScreenshot
                    TakesScreenshot ts=(TakesScreenshot)driver;
                    // Call method to capture screenshot
                    File source=ts.getScreenshotAs(OutputType.FILE);

                    // Copy files to specific location here it will save all screenshot in our project home directory and
                    // result.getName() will return name of test case so that screenshot name will be same
                    FileUtils.copyFile(source, new File("C:\\Janish\\failss"+result.getName()+".png"));

                    System.out.println("Screenshot taken");
                }
                catch (Exception e) {

                    System.out.println("Exception while taking screenshot "+e.getMessage());
                }
   }
// close application
            driver.quit();
        }
    }
