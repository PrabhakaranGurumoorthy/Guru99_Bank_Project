package Testcases;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Login_check_Updated {
    static WebDriver driver=null;
    public static void setup(){
        System.setProperty("Webdriver.geckodriver.driver", Utils.FirefoxDriverlocation);
        ProfilesIni prof=new ProfilesIni();
        FirefoxProfile profile =new FirefoxProfile();
        driver=new FirefoxDriver();
        driver.get(Utils.Base_URl);
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(Utils.Wait_time));
        WebElement element=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='uid']"))));
    }
    public static void main(String[] args) {
        setup();
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr580840");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mAvAsYh");
        driver.findElement(By.xpath("(//input[@name='btnLogin'])[1]")).click();
        String tittle=driver.getTitle();
        if (tittle.contains("Guru99 Bank Manager HomePage")) {
            System.out.println("Test case: Passed");
        }
        else {
            System.out.println("Test case : Failed");
        }
        driver.quit();


    }
}
