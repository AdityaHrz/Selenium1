package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        // Creating a driver object for Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.softwaretestingmaterial.com/");
        Thread.sleep(2000);
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

        // Using RelativeLocator to locate an element to the left
        WebElement referenceElement = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
        WebElement findLeftof = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(referenceElement));
        findLeftof.click();

        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);

        // Switch to the next tab
        driver.switchTo().window(driver.getWindowHandles().iterator().next());

        // Switch to a specific tab by index (0-based)
        int tabIndex = 1; // Index of the tab you want to switch to
        driver.switchTo().window((String) driver.getWindowHandles().toArray()[tabIndex]);

        driver.close();

        // Using RelativeLocator to locate an element to the right
        WebElement referenceElement1 = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
        WebElement findRightof1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(referenceElement1));
        findRightof1.click();

    }
}
