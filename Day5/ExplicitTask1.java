package com.selenium.aditya;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTask1 {
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aghorpade\\Documents\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.setBinary("C:\\Users\\aghorpade\\Documents\\chrome-win64\\chrome.exe");
        
        // Chrome Driver Object
        WebDriver driver = new ChromeDriver(co);
        
        long starttime = System.currentTimeMillis();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        // Username
        WebDriverWait usernamewait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = usernamewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        username.click();
        username.sendKeys("Admin");
        
        // Password
        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.click();
        password.sendKeys("admin123");
        password.sendKeys(Keys.ENTER);
        
        // Admin Click
        WebDriverWait adminclickwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement adminclick = adminclickwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
        adminclick.click();
        
        // Username search
        WebDriverWait sclickwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sclick = sclickwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
        sclick.click();
        sclick.sendKeys("Admin");
        
        WebDriverWait searchclickwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchclick = searchclickwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
        searchclick.click();
        
        Thread.sleep(5000);
        
        // Explicit wait for the profile click element to be clickable
        WebDriverWait profileWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profileclick = profileWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")));
        profileclick.click();
       
        // Explicit wait for the logout element to be clickable
        WebDriverWait logoutWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logout = logoutWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")));
        logout.click();
         
        long finishtime = System.currentTimeMillis();
        System.out.println(((finishtime - starttime) / 1000.0) + " Seconds...");
        
        // Close the browser
        //driver.quit();
    }
}
