package class07.HWTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
//        @here goto https://demoqa.com/nestedframes
//        print the text childframe on console
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        WebElement frame1=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        driver.switchTo().frame(frame1);

        System.out.println("The text is "+frame1.getText());





    }
}
