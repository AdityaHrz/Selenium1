package com.selenium.aditya;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    public static void main(String[] args) throws InterruptedException {	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\aghorpade\\Documents\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions co= new ChromeOptions();
        //browser setup
        co.setBinary("C:\\Users\\aghorpade\\Documents\\chrome-win64\\chrome.exe");
        // Chrome Driver Object
        WebDriver driver =  new ChromeDriver(co);
    
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.youtube.com");
//        driver.findElement(By.name("search_query")).sendKeys("Billie Eilish",Keys.ENTER);
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com");
        //type in search element
        driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
        //click google search
       // driver.findElement(By.className("RNmpXc")).submit();
        //maximize window
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
        
//        WebElement btnI= driver.findElement(By.linkText("Gmail"));
//        boolean checkbtn= btnI.isEnabled();
//        System.out.println(checkbtn);
        
        WebElement samsungboxelement= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
        samsungboxelement.click();
        
       //display
        List<WebElement> data=driver.findElements(By.className("_4rR01T"));
        for(WebElement webElement : data) {
        	System.out.println(webElement.getText());
        }
//        
//        WebElement compareboxelement1= driver.findElement(By.xpath("////*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/span/label/div"));
//        compareboxelement1.click();
//        
//        WebElement compareboxelement2= driver.findElement(By.xpath("////*[@id=\"container\"]/div/div[3]/div/div[2]/div[4]/div/div/div/a/div[2]/div[2]/div/span/label/div"));
//        compareboxelement2.click();
        
//        String valueofsrboxid = searchboxelement.getAttribute("role") ;
//        System.out.println(valueofsrboxid);
//        
//        Thread.sleep(4000);
//        driver.quit();
    }
}