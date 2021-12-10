package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class HWTask2 {
    public static void main(String[] args) {
        /*
        task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.
         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("ADMIN");
driver.findElement(By.xpath("//div[@id='divPassword']/child::input")).sendKeys("Syntaxxx12");
driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input")).click();
boolean result = driver.findElement(By.xpath("//div[@id='divLoginButton']/child::span")).isDisplayed();
        System.out.println(result);
    }
}
