package stepDefinations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import core.ConfigManager;
import core.DriverManager;
import core.ExtentManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import page.LoginPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Hooks {

    public static ExtentReports extent = ExtentManager.getInstance();
    public static ExtentTest test;
    private static final Logger log = LogManager.getLogger(Hooks.class);

    // Hooks in Cucumber
    @Before
    public void setup(Scenario scenario) {
        test = extent.createTest(scenario.getName());
        DriverManager.intialiaseBrowser(ConfigManager.get("browser"));

        log.info("Chrome Browser Intialsed");
    }

    @AfterStep
    public void takesScreenshotofEachStep(Scenario scenario) throws IOException {

        File src = ((TakesScreenshot) DriverManager.getDriver())
                .getScreenshotAs(OutputType.FILE);

        String fileName = "image_" + System.currentTimeMillis() + ".png";

        File dest = new File("C:\\Users\\sachinsharma05\\IdeaProjects\\VijayFirstProject\\Screenhshots\\" + fileName);

        FileHandler.copy(src, dest);
    }


    @After
    public void teardown(Scenario scenario) {

        // store screenshot locally for all the Screens

        WebDriver driver = DriverManager.getDriver();

        try {
            if (scenario.isFailed()) {

                String screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BASE64);


                test.fail("Scenario Failed",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());

            } else {
                test.pass("Scenario Passed");
            }

        } catch (Exception e) {
            test.warning("Screenshot capture failed: " + e.getMessage());
        }

        // Quit driver
        DriverManager.getDriver().quit();
        log.info("Browser Exited");


        // Flush report
        extent.flush();

    }
}
