package com.selenium.aditya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        // Creating an object of ChromeDriver browser
        WebDriver driver = new ChromeDriver();

        // Opening the browser
        driver.get("http://omayo.blogspot.com/");

        // Maximizing the window
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@id=\"table1\"]"));
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through rows starting from 1 (to skip the header)
        for (int i = 1; i < rows.size(); i++) {
            WebElement row = rows.get(i);
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the i-th element from each row
            if (i <= cells.size()) {
                System.out.print(cells.get(i - 1).getText() + "\t");
            }
        }
    }
}
