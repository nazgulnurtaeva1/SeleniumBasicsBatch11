package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask3 {
    public static void main(String[] args) {
        /*
        task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
driver.findElement(By.cssSelector("input[placeholder^='First']")).sendKeys("Nazzz");
driver.findElement(By.cssSelector("input[name$='last_name']")).sendKeys("Nurtay");
driver.findElement(By.cssSelector("input[placeholder^=\"E-Mail\"]")).sendKeys("Jhhfb1@gmail.com");
//driver.findElement(By.cssSelector(""))
driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("918-845-2375");
driver.findElement(By.cssSelector("input[name='address']")).sendKeys("1250 Garden City Rd");
driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Detroit");
driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Michigan");
driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("48823");
driver.findElement(By.cssSelector("input[name='website']")).sendKeys("https://DuNai.com");

    }
}
