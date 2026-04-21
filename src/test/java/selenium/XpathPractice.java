package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {


    public static void main(String[] args) {

        WebDriver driver;

        driver=new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       driver.findElement(By.xpath("//input[@id='field2']")).sendKeys("sachin");

       //indexing in Xpath
       // (//div[@class='form-group'])[1]




       // Parent to child Traversal + Indexing
       // ((//div[@class='form-group'])[1]/input)[1]
        //div[@class='sidebar section']/div/div/form




        // Xpath with Text Value only
        //button[text()='START']




        // Dynamic Xpath
        //input[contains(@id,'le')]


        // Sibling to sibling Traversal in forward direction
        //input[@id='singleFileInput']/following-sibling::button



        // Sibling to sibling traversal in backward direction
       // (//button[@type='submit'])[1]/preceding-sibling::input



        // Child to Parent Traversal
        //input[@id='singleFileInput']/parent::form/parent::div




    }
}
