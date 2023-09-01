package com.selenium.aditya;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandsOn {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        driver.manage().window().maximize();
        
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("promptexample"));
        
        // Move to element and click
        actions.moveToElement(element).click().perform();
        driver.switchTo().alert().sendKeys("Aditya");
        
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
       
        
        // Close the browser
        //driver.quit();
    }
}
