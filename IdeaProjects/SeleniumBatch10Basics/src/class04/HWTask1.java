package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTask1 {
    public static void main(String[] args) throws InterruptedException {
        /* task1:(use xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username Leave password field empty. Click on login button
Verify error message with text “Password cannot be empty” is displayed. */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ADMIN");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
boolean result = driver.findElement(By.xpath("//span[contains(text(),'Password can')]")).isDisplayed();
        Thread.sleep(4000);
        System.out.println(result);




    }
}
