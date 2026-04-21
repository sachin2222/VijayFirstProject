package selenium.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    String baseURL = "https://rahulshettyacademy.com/client/#/auth/login";

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Before Test runs before all the @Test
    @BeforeTest
    public void setWaitTime() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void navigateToURL() {
        driver.get(baseURL);
        Assert.assertEquals(driver.getCurrentUrl(), baseURL);

    }


    @Test(priority = 2)
    public void invalidLoginTest() {
        driver.findElement(By.id("userEmail")).sendKeys("vijay@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Password@123");
        driver.findElement(By.id("login")).click();

        // user will remanins on same url
        Assert.assertEquals(driver.getCurrentUrl(), baseURL);
    }


    // Annotattions
    @Test(priority = 3)
    public void validLoginTest() {
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userPassword")).clear();

        driver.findElement(By.id("userEmail")).sendKeys("tr90wq@eample.com");
        driver.findElement(By.id("userPassword")).sendKeys("Password@123");
        driver.findElement(By.id("login")).click();

        WebElement element = driver.findElement(By.xpath(" //*[text()=' Sign Out ']"));
        Assert.assertTrue(element.isDisplayed());


    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }


}
