package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

//get all the rows
        List<WebElement> rows =driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        //print all the rows

        for(int i=0; i< rows.size(); i++) {
            String rowText = rows.get(i).getText();
            System.out.println(rowText);
            //check if the row has a product screensaver
            if(rowText.contains("ScreenSaver")) {
               List<WebElement> checkBoxes =  driver.findElements(By.xpath("//table[@id]"));
               checkBoxes.get(i-1).click();

            }

        }



    }
}
