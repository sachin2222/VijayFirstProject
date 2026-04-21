package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("datepicker")).click();

//        List<WebElement> aprilDates = driver.findElements(By.className("ui-state-default"));
//
//        // select 23 april
//        for (WebElement date : aprilDates) {
//            if (date.getText().equalsIgnoreCase("23")) {
//                date.click();
//                break;
//            }
//        }


        // Requirement 2- Select Date in Next month - 10 may 2026
        // Click on Next Button
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        List<WebElement>  MayDates = driver.findElements(By.className("ui-state-default"));

        // select 10 may
        for (WebElement date : MayDates) {
            if (date.getText().equalsIgnoreCase("10")) {
                date.click();
                break;
            }
        }

        // Assignment - Select 12 Aug 2026

    }
}
