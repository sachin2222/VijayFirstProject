package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsTabs {

    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click on New Tab
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

        Set<String> windowsId = driver.getWindowHandles();
        System.out.println(windowsId.size());
        // Set Size is equal to Total Number of Windows open


        Iterator<String> it = windowsId.iterator();
        String currentWindowID = it.next();//current window ID
        String nextWindowID = it.next();//Next Window

        System.out.println(driver.getTitle());


        // Switch webdriver to Next WebPage
        driver.switchTo().window(nextWindowID);
        System.out.println(driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//h3[@itemprop='name']/a")).getText());

        // switch your webdriver to original web page
        driver.switchTo().window(currentWindowID);
        System.out.println(driver.getTitle());




       // driver.close();// close wil close the current window
        driver.quit();// Quit will close all the browser sessions


    }
}
