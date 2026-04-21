package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Click on simple alert
        //driver.findElement(By.id("alertBtn")).click();
        //Thread.sleep(5000);
        //driver.switchTo().alert().accept();// Click OK button


        //Confirmation alert
//        driver.findElement(By.id("confirmBtn")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().dismiss();// Click cancel Button
//        WebElement message=driver.findElement(By.xpath("//p[@id='demo']"));
//        System.out.println(message.isDisplayed());

        //Prompt Alert
        driver.findElement(By.id("promptBtn")).click();
        Thread.sleep(5000);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("I am Vijay");
        alert.accept();// click OK







    }
}
