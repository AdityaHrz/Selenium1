package com.selenium.aditya;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameCart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();

        // Creating a driver object for Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        Select s = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));
        List<WebElement> dropdownlist = s.getOptions();

        	s.
        List<String> optionTexts = new ArrayList<>();
        for (WebElement webElement : dropdownlist) {
            optionTexts.add(webElement.getText());
        }

        System.out.println("Original options:");
        for (String optionText : optionTexts) {
            System.out.println(optionText);
        }

        // Sorting the option texts in ascending order
        Collections.sort(optionTexts);

        System.out.println("\nOptions in ascending order:");
        for (String optionText : optionTexts) {
            System.out.println(optionText);
        }
        s.selectByIndex(3);
        s.selectByIndex(2);
        System.out.println("\nSelected Options");
        

        
    }
}
