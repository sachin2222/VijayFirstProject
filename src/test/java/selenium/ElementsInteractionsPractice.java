package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsInteractionsPractice {


    public static void main(String[] args) {
        WebDriver driver;

        driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.name("radioButton")).click();

        //Locators
        //id
        //name
        //Xpath
        //Css
        //tagname
        //ClassName
        //LinkText
        //PartialLinkText



    }
}
