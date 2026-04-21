package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUplaod {

    // Java
    // Selenium
    // Testng
    // Cucumber
    //Page Object
    // Maven
    // Framework development from Scratch

    public static void main(String[] args) {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\DL.pdf");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


        WebElement multipleUpload=driver.findElement(By.id("multipleFilesInput"));
        multipleUpload.sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\DL.pdf");
        multipleUpload.sendKeys("C:\\Users\\sachinsharma05\\OneDrive - Nagarro\\Desktop\\Personal docs\\epfo.pdf");


        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }
}
