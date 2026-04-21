package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOM {

    public static void main(String[] args) {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step1 - Capture shadow DOM as a One webElement

        WebElement ShadowHost = driver.findElement(By.id("shadow_host"));

        //Steps:2 search context has accessbility of all teh webelements inside Shadow DOM
        SearchContext searchContext = ShadowHost.getShadowRoot();

        WebElement Blog = searchContext.findElement(By.linkText("Blog"));


        // Click on Hidden Elements always by JavaScriptExceutor
        // JavaScriptExceuor is Highly Stable than webDriver

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",Blog);







    }
}
