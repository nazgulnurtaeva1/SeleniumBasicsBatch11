package class04_Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classExample {
    public static void main(String[] args) {
        //set the path of the driver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        // browser launched
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //it`s return current url from the browser
        //System.out.println(driver.getCurrentUrl());

        //return title of the page


        // driver.quit();
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");;
        driver.findElement(By.id("btnLogin")).click();
    }
}
