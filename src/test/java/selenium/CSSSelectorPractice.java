package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice {


    public static void main(String[] args) {

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String type = driver.findElement(By.cssSelector("input[id='female']")).getAttribute("type");
       // System.out.println(type);// radio


        // To verify if Title is Displayed on WebPage or not
        WebElement title=driver.findElement(By.xpath("//h1[@class='title']"));
       // System.out.println(title.getText());
        //System.out.println(title.isDisplayed());

        WebElement maleRadioButton=driver.findElement(By.id("male"));
        System.out.println(maleRadioButton.isSelected());//false
        maleRadioButton.click();
        System.out.println(maleRadioButton.isSelected());//true


        // IsEnabledMethod on Text Boxes and Buttons on this Page







    }
}
