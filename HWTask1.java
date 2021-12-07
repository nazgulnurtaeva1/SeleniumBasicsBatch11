package com.syntax.Batch11Selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {
    /*
    HW1
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD3
1FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD3\n" +
        "1FF0AFEDBDF4454B27BBC5C05B0%22");
driver.findElement(By.id("customer.firstName")).sendKeys("Nazgul");
driver.findElement(By.id("customer.lastName")).sendKeys("Nurtay");
driver.findElement(By.name("customer.address.street")).sendKeys("1250 Garden City Rd");
driver.findElement(By.id("customer.address.city")).sendKeys("East Lansing");
driver.findElement(By.id("customer.address.state")).sendKeys("MI");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("48823");
driver.findElement(By.id("customer.phoneNumber")).sendKeys("4858775848");
driver.findElement(By.id("customer.ssn")).sendKeys("209-32-4232");
driver.findElement(By.id("customer.username")).sendKeys("naz2711");
driver.findElement(By.id("customer.password")).sendKeys("sdhhfghdfg332");
driver.findElement(By.id("repeatedPassword")).sendKeys("sdhhfghdfg332");
driver.findElement(By.className("button")).click();
Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("naz2711");
        driver.findElement(By.name("password")).sendKeys("sdhhfghdfg332");
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
driver.quit();





    }



}
