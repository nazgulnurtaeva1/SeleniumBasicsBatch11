package com.syntax.Batch11Selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
     //   driver.findElement(By.id("email")).sendKeys("nfjhfgvj@gmail.com");

        driver.findElement(By.name("email")).sendKeys("fjhfjgkjfjkg@gmail.com");
        driver.findElement(By.name("passs")).sendKeys("hffjfhhdhf");
        //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgetten")).click();
        driver.quit();


    }
}
