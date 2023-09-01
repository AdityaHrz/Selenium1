package com.selenium.aditya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();

	        // Creating a driver object for Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/frames");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	        
	        

	        // For example, let's print the text present in the frame
	        WebElement frameElement = driver.findElement(By.id("frame1"));
	        driver.switchTo().frame(frameElement);
	        
	        WebElement frameText=driver.findElement(By.id("sampleHeading"));
	        String text = frameText.getText();
	        System.out.println(text);

	        // Switch back to the main content if needed
	        driver.switchTo().defaultContent();
	        
	       // WebElement frameElementretry = driver.findElement(By.id("frame1"));
	       // driver.switchTo().frame(frameElementretry);
	        
	        WebElement frameTextretry=driver.findElement(By.id("sampleHeading"));
	        String textretry = frameTextretry.getText();
	        System.out.println(textretry);
	        
	        
	    
	}

}
