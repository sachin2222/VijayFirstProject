package Utility;

import core.DriverManager;
import org.openqa.selenium.By;

public class ElementActions {

    //1 . How do you designe framework scalable selenoum with Testng and java?

    WaitUtils waitUtils=new WaitUtils();
    public void type(By locator,String data){
        waitUtils.waitForElementTobeVisible(locator);
        DriverManager.getDriver().findElement(locator).sendKeys(data);
    }

    public void clickElement(By locator){
        waitUtils.waitForElementTobeVisible(locator);
        DriverManager.getDriver().findElement(locator).click();
    }

    public boolean isElementVisible(By locator){
       boolean b= DriverManager.getDriver().findElement(locator).isDisplayed();
       return b;

    }



}
