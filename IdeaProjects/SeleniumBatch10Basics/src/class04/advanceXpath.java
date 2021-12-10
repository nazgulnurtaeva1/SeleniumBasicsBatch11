package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("ADMIN");
       Thread.sleep(3000);
driver.findElement(By.xpath(" //span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm13");
driver.findElement(By.xpath("//input[starts-with(@value, 'LOG')]")).click();


    }
}
