package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LatestVersion {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // Creating a driver object for Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        //Above Locator
        By user =RelativeLocator.with(By.name("username")).above(By.name("password"));
        WebElement a= driver.findElement(user);
        a.sendKeys("Admin");
        
        //Below Locator
        By pass =RelativeLocator.with(By.name("password")).below(By.name("username"));
        WebElement b= driver.findElement(pass);        
        b.sendKeys("admin123");
        
        //above Locator by tagname
        By click =RelativeLocator.with(By.tagName("button")).above(By.className("orangehrm-login-forgot"));
        WebElement c= driver.findElement(click);        
        c.click();
        
    }
}
