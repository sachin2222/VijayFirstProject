package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPractice {

    public static void main(String[] args) {

        //HandlingBrowser Related Ops
        // Window Scrolling
        // Window Scrolling to Particular WebElement
        // Click
        //SendKeys
        // Handling Hidden elements

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();

        // Casting our webdriver to JavaScriptor
        JavascriptExecutor js=(JavascriptExecutor)driver;

        // window Scrlloing
        //js.executeScript("window.scrollBy(0,2000)");
        //Scrolling to Particlular webelement

        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.partialLinkText("403")));

        // Click
        //js.executeScript("arguments[0].click();",driver.findElement(By.partialLinkText("403")));


        //sendKeys
        js.executeScript("arguments[0].value='Vijay';",driver.findElement(By.id("Wikipedia1_wikipedia-search-input")));




    }
}
