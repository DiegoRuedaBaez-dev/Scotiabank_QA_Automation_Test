package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.loginPage;
import utils.driverFactory;

public class loginSteps {

    private WebDriver driver = driverFactory.getDriver();
    private loginPage loginPage = new loginPage(driver);

    @Given("I am on the SauceDemo login page")
    public void i_am_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string}")
    public void i_enter_username(String user) {
        loginPage.enterUsername(user);
    }

    @When("I enter password {string}")
    public void i_enter_password(String pass) {
        loginPage.enterPassword(pass);
    }

    @When("I click the login button")
    public void i_click_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should see {string}")
    public void i_should_see(String expected) {

        if (expected.contains("inventory")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
        }
        else if (expected.contains("error")) {
            Assert.assertTrue(loginPage.getErrorMessage().length() > 0);
        }
    }
}
