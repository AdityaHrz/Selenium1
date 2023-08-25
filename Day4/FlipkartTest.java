package com.selenium.aditya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


//

public class FlipkartTest {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\aghorpade\\Documents\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Flipkart website
        driver.get("https://www.flipkart.com/");

        // Locate and enter search query
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("OnePlus mobile");
        searchInput.submit();

        // Apply filter for OnePlus 11R series
        WebElement filter11R = driver.findElement(By.xpath("//div[text()='OnePlus 11R series']"));
        filter11R.click();

       
        
        // Choose two mobiles with 8GB RAM each
        List<WebElement> mobiles = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
        if (mobiles.size() >= 2) {
            WebElement firstMobile = mobiles.get(0);
            WebElement secondMobile = mobiles.get(1);

            // Click on "Compare" for both selected mobiles
            firstMobile.findElement(By.xpath(".//following-sibling::div//div[text()='Add to Compare']")).click();
            secondMobile.findElement(By.xpath(".//following-sibling::div//div[text()='Add to Compare']")).click();

            // Click on the "Compare" button at the bottom of the page
            driver.findElement(By.xpath("//span[text()='COMPARE']")).click();

            // Verify both mobiles are added to comparison list
            WebElement comparisonList = driver.findElement(By.xpath("//div[@class='_1Bcw7C']"));
            List<WebElement> comparedItems = comparisonList.findElements(By.className("_30jeq3"));

            if (comparedItems.size() == 2) {
                // Identify the cheaper mobile
                WebElement cheaperMobile = comparisonList.findElement(By.xpath("//div[@class='_3dGepu']"));

                // Click on "Add to Cart" for the cheaper mobile
                cheaperMobile.findElement(By.xpath(".//button[text()='Add to Cart']")).click();

                // Verify the selected mobile is added to the cart
                WebElement cartNotification = driver.findElement(By.xpath("//div[text()='Added to Cart']"));

                // Your verification logic goes here

            } else {
                System.out.println("Error: Mobiles not added to comparison list.");
            }
        } else {
            System.out.println("Error: Not enough mobiles found for comparison.");
        }

        // Close the browser
        driver.quit();
    }
}
