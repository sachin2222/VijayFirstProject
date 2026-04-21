package page;

import Utility.ElementActions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

//Page Object Model
public class HomePage {

    By logoutBy= By.xpath("//*[text()=' Sign Out ']");
    private static final Logger log = LogManager.getLogger(HomePage.class);

    ElementActions elementActions=new ElementActions();

    public boolean isLogoutButtonVisible(){
       boolean b= elementActions.isElementVisible(logoutBy);
       return b;

    }

    public void clickLogout(){

        elementActions.clickElement(logoutBy);
        log.info("User Clicked Logout");
    }
}
