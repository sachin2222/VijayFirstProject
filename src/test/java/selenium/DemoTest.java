package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

    public static void main(String[] args) {

        WebDriver driver;
        // chrome
        //WebDriver
        driver = new ChromeDriver();// Upcasting


        //firefox
        //WebDriver
        driver = new FirefoxDriver();


        //edge
        //WebDriver
        driver = new EdgeDriver();


    }
}
