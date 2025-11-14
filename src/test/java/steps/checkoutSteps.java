package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.checkoutPage;
import pages.loginPage;
import utils.driverFactory;

public class checkoutSteps {

    WebDriver driver = driverFactory.getDriver();

    loginPage loginPage = new loginPage(driver);
    checkoutPage checkoutPage = new checkoutPage(driver);

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I log in using {string} with password {string}")
    public void login(String user, String password) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @And("I add a product to the cart")
    public void addProductToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("I go to the cart")
    public void goToCart() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @And("I click Checkout")
    public void clickCheckout() {
        checkoutPage.clickCheckout();
    }

    @And("I enter first name {string}")
    public void enterFirstName(String first) {
        checkoutPage.enterFirstName(first);
    }

    @And("I enter last name {string}")
    public void enterLastName(String last) {
        checkoutPage.enterLastName(last);
    }

    @And("I enter postal code {string}")
    public void enterPostalCode(String postal) {
        checkoutPage.enterPostalCode(postal);
    }

    @And("I continue checkout")
    public void continueCheckout() {
        checkoutPage.clickContinue();
    }

    @Then("I should see the checkout overview page")
    public void verifyOverview() {
        Assert.assertTrue("Overview page not displayed", checkoutPage.isOverviewDisplayed());
    }

    @And("the user {string} should be able to complete the order")
    public void userShouldCompleteOrder(String user) {
        checkoutPage.finishOrder();
        Assert.assertTrue("Order not completed successfully", checkoutPage.isOrderComplete());
    }
}