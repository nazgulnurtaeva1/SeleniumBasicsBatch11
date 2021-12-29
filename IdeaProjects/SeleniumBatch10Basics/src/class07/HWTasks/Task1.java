package class07.HWTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
//        goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
//        click on follow on instagram
//        click on facebook.com
//        get all windows handles

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
       WebElement byinsta=driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));
        byinsta.click();
        Thread.sleep(2000);
WebElement byFB=driver.findElement(By.xpath("//a[contains(@title,'Follow @syntaxtech on Facebook')]"));
byFB.click();

        Set<String> windowsHandles = driver.getWindowHandles();
        Iterator<String> iterator= windowsHandles.iterator();
        String insta = iterator.next();
        String fb=iterator.next();
        System.out.println("The handle for instagram  page "+insta);
        System.out.println("The handle for facebook page "+fb);
        System.out.println("The size of all handlers "+windowsHandles.size());


    }
}
