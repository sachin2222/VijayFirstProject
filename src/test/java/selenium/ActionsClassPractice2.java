package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice2 {


    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();

        // double click
        Actions actions = new Actions(driver);
        WebElement CopyText = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        actions.doubleClick(CopyText).perform();

        WebElement sourceBtn=driver.findElement(By.id("draggable"));
        WebElement destinationBtn=driver.findElement(By.id("droppable"));

        actions.dragAndDrop(sourceBtn,destinationBtn).perform();

        // Right Click
       // actions.contextClick(CopyText).perform();

        //Slider
        WebElement slider1=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[1]"));
        WebElement slider2=driver.findElement(By.xpath("(//div[@id='slider-range']/span)[2]"));

        actions.dragAndDropBy(slider1,-25,0).perform();
        actions.dragAndDropBy(slider2,-75,0).perform();

        //Assigment
        // Type your name in FirstName Text Box in CAPITAL Letters




    }
}
