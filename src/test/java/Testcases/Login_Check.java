package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Check {
    static WebDriver driver=null;
    public static void main(String[] args) {
        try {
            driver=new FirefoxDriver();
            driver.get("https://www.demo.guru99.com/V4/");
            driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr580840");
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mAvAsYh");
            driver.findElement(By.xpath("(//input[@name='btnLogin'])[1]")).click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }


    }

}
