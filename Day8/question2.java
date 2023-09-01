package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class question2 {
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
        
        //driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        
        driver.manage().window().maximize();
        // Locate the checkbox element using its xpath
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
        // Check if the checkbox is enabled
        boolean isEnabled = checkbox.isEnabled();
        // Print the result
        if (isEnabled) {
            System.out.println("red Checkbox is enabled.");
        } else {
            System.out.println("red Checkbox is disabled.");
        }
        boolean isSelected = checkbox.isSelected();
        if (isSelected) {
            System.out.println("Checkbox is Selected.");
        } else {
            System.out.println("Checkbox is not Selected.");
        }
        WebElement Orangeboxelement= driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
        Orangeboxelement.click();
        
        WebElement Greenboxelement1= driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
        Greenboxelement1.click();
        
        WebElement Purpleboxelement2= driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
        Purpleboxelement2.click();
        
        
        WebElement IEcheckbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
        boolean isSelected2 = IEcheckbox.isSelected();
        if (isSelected2) {
            System.out.println("InternetExplorer Checkbox is Selected.");
        } else {
            System.out.println("InternetExplorer Checkbox is not Selected.");
        }
        
        WebElement Operacheckbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
        boolean isSelected3 = Operacheckbox.isSelected();
        if (isSelected3) {
            System.out.println("OperaRadioBox is Selected.");
        } else {
            System.out.println("OperaRadioBox is not Selected.");
        }
        
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();
    }
}