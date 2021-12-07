package com.syntax.Batch11Selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;
import static java.lang.Thread.sleep;

public class HWTask2 {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Jean");
        driver.findElement(By.name("lastname")).sendKeys("Vanderbilt");
        driver.findElement(By.name("reg_email__")).sendKeys("JeanV@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("JeanV@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Jean1993@22");
        Thread.sleep(3000);
driver.findElement(By.name("birthday_month")).sendKeys("Nov");
driver.findElement(By.name("birthday_day")).sendKeys("27");
driver.findElement(By.name("birthday_year")).sendKeys("1993");
driver.findElement(By.xpath("//input[@value='2']")).click();
driver.findElement(By.name("websubmit")).click();
Thread.sleep(4000);
driver.close();
    }

}
