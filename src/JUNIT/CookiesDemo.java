package JUNIT;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
/**
 * Created by janish on 7/15/2017.
 */
public class CookiesDemo {


    public static void main(String[] args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.avactis.com/4.7.9/");

        driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/ul/li[1]/span/a")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // Input Emial id and Password If you are already Register
        driver.findElement(By.xpath(".//*[@id='account_sign_in_form_email_id']")).sendKeys("janish.siroya@sjsu.edu");
        driver.findElement(By.xpath(".//*[@id='account_sign_in_form_passwd_id']")).sendKeys("mithibairox1");
        driver.findElement(By.xpath("//input[@class='btn btn-primary input_submit']")).click();

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try
        {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information
            for(Cookie ck : driver.manage().getCookies())
            {
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.flush();
            Bwrite.close();
            fileWrite.close();
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
