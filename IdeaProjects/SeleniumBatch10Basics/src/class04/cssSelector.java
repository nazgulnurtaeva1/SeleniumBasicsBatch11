package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php ");
        driver.findElement(By.cssSelector("input#sum1")).sendKeys("19");
        driver.findElement(By.cssSelector("input#sum2")).sendKeys("15");
        driver.findElement(By.cssSelector("button[onclick$='total()']")).click();


        // http://syntaxprojects.com/basic-first-form-demo.php
    }
}