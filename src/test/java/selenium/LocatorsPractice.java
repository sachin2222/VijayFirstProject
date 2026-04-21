package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsPractice {

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        //driver.findElement(By.id("name")).sendKeys("sachin");
       // driver.findElement(By.id("email")).sendKeys("sachin@gmail.com");

        //tagName
        List<WebElement> webElementList = driver.findElements(By.tagName("label"));// 29
        //System.out.println(webElementList.size());

        for (WebElement element : webElementList) {

            //System.out.println(element.getText());
        }

        //ClassName

        List<WebElement> webElementList2 = driver.findElements(By.className("form-check"));// 29
        //System.out.println(webElementList2.size());

        for (WebElement element : webElementList2) {

            //System.out.println(element.getText());
        }


        //LinkText--> //a

        //driver.findElement(By.linkText("Apple")).click();




        //PartialLinkText-->//a
        driver.findElement(By.partialLinkText("408")).click();




    }
}
