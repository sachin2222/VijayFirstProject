package Utility;

import core.ConfigManager;
import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    int timeout = Integer.parseInt(ConfigManager.get("timeouts"));
    WebDriverWait webDriverWait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));

    public void waitForElementTobeVisible(By locator){

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
