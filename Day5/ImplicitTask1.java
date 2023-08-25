package com.selenium.aditya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitTask1 {
	
	 public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\aghorpade\\Documents\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions co= new ChromeOptions();
	        co.setBinary("C:\\Users\\aghorpade\\Documents\\chrome-win64\\chrome.exe");
	        
	        // Chrome Driver Object
	        WebDriver driver =  new ChromeDriver(co);
	        
	        //
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	        long starttime=System.currentTimeMillis();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();
	        
	        //Username
	        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	        username.click();
	        username.sendKeys("Admin");
	        
	        //Password
	        WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	        password.click();
	        password.sendKeys("admin123");
	        password.sendKeys(Keys.ENTER);
	        
	        //Profile Click
	        WebElement profileclick = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));
	        profileclick.click();
	       
	      //Finish
	        long finishtime=System.currentTimeMillis();	        
	        System.out.println(((finishtime-starttime)/1000.0)+"Seconds...");
	        
	        //Logout
	        WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
	        logout.click();
	        
	      //Verify
	        String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	        if (expectedUrl.equals(driver.getCurrentUrl())) {
	            System.out.println("This is Dashboard Page");
	        } else {
	            System.out.println("This is not the expected page");
	        }
	        
	        
	     // Close the browser
	        driver.quit();
	        
	 }
	
}