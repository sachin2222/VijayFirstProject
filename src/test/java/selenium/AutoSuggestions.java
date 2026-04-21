package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggestions {


    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
        driver.manage().window().maximize();

        driver.findElement(By.id("autocomplete")).sendKeys("br");
        // Select India

        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-menu-item-wrapper")));

        List<WebElement> countryList=driver.findElements(By.className("ui-menu-item-wrapper"));
        System.out.println(countryList.size());// 3

        for(WebElement country:countryList){

            if(country.getText().equals("Brazil")){
                country.click();
                break;
            }
        }


    }
}
