package page;

import Utility.ElementActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


//Page Object Class
// To store and define all the locators on this Page
// Each Page should have one Page Object Class
public class LoginPage {

    By userEmailBy = By.id("userEmail");
    By passwordBy = By.id("userPassword");
    By loginBy = By.id("login");

    // Define the actions performed on those locators
    ElementActions elementActions=new ElementActions();

    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public void enterUserName(String email){
        elementActions.type(userEmailBy,email);
        log.info("User enters Email "+ email);

    }

    public void enterPassword(String password){

        elementActions.type(passwordBy,password);
        log.info("User enters Password "+ password);
    }
    public void clickLoginButton(){

        elementActions.clickElement(loginBy);
        log.info("User Clicks Login Button");
    }


}
