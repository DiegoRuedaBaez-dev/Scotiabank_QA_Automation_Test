package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.filteringPage;
import utils.driverFactory;

import java.util.List;

public class filteringSteps {

    private WebDriver driver = driverFactory.getDriver();
    private filteringPage filteringPage = new filteringPage(driver);

    @Given("I am logged in as {string}")
    public void i_am_logged_in_as(String user) {
        driver.get("https://www.saucedemo.com/");
        pages.loginPage login = new pages.loginPage(driver);
        login.login(user, "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @When("I select filter {string}")
    public void i_select_filter(String filterOption) {
        filteringPage.selectFilterOption(filterOption);
    }

    @Then("products should be ordered from lowest to highest")
    public void products_low_to_high() {

        List<Double> prices = filteringPage.getProductPrices();
        List<Double> sorted = prices.stream().sorted().toList();

        Assert.assertEquals(sorted, prices);
    }

    @Then("products should be ordered from highest to lowest")
    public void products_high_to_low() {

        List<Double> prices = filteringPage.getProductPrices();
        List<Double> sorted = prices.stream().sorted((a, b) -> Double.compare(b, a)).toList();

        Assert.assertEquals(sorted, prices);
    }

    @Then("products should be ordered alphabetically ascending")
    public void products_a_to_z() {

        List<String> names = filteringPage.getProductNames();
        List<String> sorted = names.stream().sorted().toList();

        Assert.assertEquals(sorted, names);
    }

    @Then("products should be ordered alphabetically descending")
    public void products_z_to_a() {

        List<String> names = filteringPage.getProductNames();
        List<String> sorted = names.stream().sorted((a, b) -> b.compareTo(a)).toList();

        Assert.assertEquals(sorted, names);
    }
}
