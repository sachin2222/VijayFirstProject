package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //sleep
        // Thread.sleep(10000);


        //Implicit wait
        // wait for maximum 10 sec before throwing exception
        // we have to define only once in any framework
        // its like a global wait for all the elements
        // if elements appears before 10 sec , Rest of the time will be skipped
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.name("vijay")).click();


        //Explicit wait
        // its applicable to Required webelement
        //its applicable for specific conditions
        // we are calling explicit wait for all the webelements
        // waiting for maximum 10 sec

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.name("start")));
        startButton.click();




    }
}
