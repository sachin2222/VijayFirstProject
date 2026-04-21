package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPratice {

    public static void main(String[] args) throws InterruptedException {
        //Mouse Related Operation
        //Keboard Related Operation
        // Double click
        // Right click
        // Drag and Drop
        // slider
        // Mouse Hover
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
        driver.manage().window().maximize();

        WebElement PointMeButton = driver.findElement(By.id("mousehover"));
        Actions actions =new Actions(driver);
        actions.moveToElement(PointMeButton).perform();
        Thread.sleep(2500);

        actions.click(driver.findElement(By.xpath("//a[@href='#top']"))).perform();


    }
}
