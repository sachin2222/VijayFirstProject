package stepDefinations;

import core.ConfigManager;
import core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.LoginPage;

import java.time.Duration;

public class LoginSteps {
    //Framework Development from Scratch
    //1 . Well Structured
    // 2. Well Maintainable
    // 3. Scalable
    //4 . Robust
    // 5. No Zig Zag(Simple Data Flow)
    //6. It should be Reusable (60-70% Code already written)
    // Fix Problem 1- How to share webdriver will all the classes?

    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();
    String baseURL = ConfigManager.get("url");

    private static final Logger log = LogManager.getLogger(LoginSteps.class);

    @Given("User is on Login Page of ecommerce application")
    public void user_is_on_login_page_of_ecommerce_application() {
        DriverManager.getDriver().get(baseURL);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), baseURL);
        log.info("User Navigated to Base URL "+baseURL);
    }

    @When("user enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.enterUserName(email);
        loginPage.enterPassword(password);

    }


    @When("user clicks on Login Button")
    public void user_clicks_on_login_button() {
      loginPage.clickLoginButton();
    }

    @Then("user should be redirected to the Dashboard Page")
    public void user_should_be_redirected_to_the_dashboard_page() {
     boolean b= homePage.isLogoutButtonVisible();
     Assert.assertTrue(b);

    }

    @When("user enters invalid email {string} and password {string}")
    public void user_enters_invalid_email_and_password(String email, String password) {
        loginPage.enterUserName(email);
        loginPage.enterPassword(password);
    }


    @Then("user should remains on same login Page")
    public void user_should_remains_on_same_login_page() {
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), baseURL);
    }


}
