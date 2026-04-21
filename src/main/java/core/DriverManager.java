package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;

    public static void intialiaseBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();

        }
        if(browser.equalsIgnoreCase("edge")){

            driver=new EdgeDriver();

        }
        if(browser.equalsIgnoreCase("firefox")){

            driver=new FirefoxDriver();

        }
        driver.manage().window().maximize();

        int timeout=Integer.parseInt(ConfigManager.get("timeouts"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
    }


    public static WebDriver getDriver(){
        return driver;
    }


}

// Static and Non static methods
// Methods
// Constructors
// this and super
