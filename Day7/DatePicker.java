package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DatePicker {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
          JavascriptExecutor js = (JavascriptExecutor) driver;
          WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
          js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
    }
}