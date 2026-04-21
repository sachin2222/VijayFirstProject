package stepDefinations;

import core.ConfigManager;
import core.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.HomePage;

public class LogoutSteps {
    String baseURL = ConfigManager.get("url");
    HomePage homePage = new HomePage();

    @When("user clicks on logout button on home Page")
    public void user_clicks_on_logout_button_on_home_page() {
        homePage.clickLogout();

    }

    @Then("user shoud be redirected to the Login Page")
    public void user_shoud_be_redirected_to_the_login_page() {

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), baseURL);

    }

}
