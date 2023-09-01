package com.selenium.aditya;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
* 
*/
public class seleniumTest {
    public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       ChromeOptions co = new ChromeOptions(); 
       co.setBinary("C:\\Users\\psugandhi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       
     //WebDriver driver= new EdgeDriver();
        driver.get("https://www.linkedin.com/feed/");
        driver.manage().window().maximize();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
         
        String title = driver.getTitle();
         System.out.println(title);
        
         driver.getPageSource();  
         String pageSource = driver.getPageSource();
         System.out.println(pageSource);
         
         String url = driver.getCurrentUrl();
         System.out.println(url);

           Set<String> s1 = driver.getWindowHandles();
           System.out.println(s1);

        Set<String> handles = driver.getWindowHandles();
        for(String h: handles) {
            System.out.println(driver.switchTo().window(h));
          System.out.println(h);

    }
}
}