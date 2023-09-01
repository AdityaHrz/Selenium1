package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();

	        // Creating a driver object for Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/droppable/");
	        
//	        Actions action = new Actions(driver);
//	        WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"home-page\"]"));
//	        action.doubleClick(hoverElement).perform();
//	        		
	        Thread.sleep(3000);
	        
	        Actions action = new Actions(driver);
	        WebElement dragElement = driver.findElement(By.id("draggable"));
	        WebElement dropElement = driver.findElement(By.id("droppable"));
	        
	        //Add scrolling command
            JavascriptExecutor jss = (JavascriptExecutor)driver;
            jss.executeScript("window.scrollBy(0,90)", "");
            
            //
	        action.clickAndHold(dragElement).release(dropElement).build().perform();
	        Thread.sleep(3000);
	        
	}
}