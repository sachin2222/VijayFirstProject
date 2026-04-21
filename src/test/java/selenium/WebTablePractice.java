package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTablePractice {

    // 15- API automation

    //  6 sessions + 5 sessions(10 sessions)
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Requriement 1 - To print all the Data of Table
        // Step 1 - Capture the WebTable as a Single WebElement
//        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
//
//        // Step2 : - Make your Table as a Mini webdriver
//        // Steps3: Capture the Rows as List of WebeLement
//
//        List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));// . means extention with Parent Xpath
//        System.out.println(rows.size());//7
//
//        // step 4: Print all the Data
//        for (WebElement row : rows) {
//            System.out.println("|" + row.getText() + "|");
//        }


        // Requirement 2- find the price of Master In Selenium
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // Step2 : - Make your Table as a Mini webdriver
        // Steps3: Capture the Rows as List of WebeLement

        List<WebElement> rows = table.findElements(By.xpath("./tbody/tr[position()>1]"));// . means extention with Parent Xpath
        System.out.println(rows.size());//6

        // step 4: Print the Pirce
        for (WebElement row : rows) {

            WebElement col1 = row.findElement(By.xpath("./td[1]"));// coulmn1
            if (col1.getText().equalsIgnoreCase("Master In Selenium")) {

                String price = row.findElement(By.xpath("./td[4]")).getText();
                System.out.println(price);
            }
        }

        // find the sum of Prices for Java Course

    }
}
