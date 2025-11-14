package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {

    WebDriver driver;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "checkout_summary_container")
    private WebElement overviewTitle;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(id = "checkout_complete_container")
    private WebElement completeHeader;

    public checkoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckout() {
        checkoutButton.click();
    }

    public void enterFirstName(String name) {
        firstNameInput.sendKeys(name);
    }

    public void enterLastName(String name) {
        lastNameInput.sendKeys(name);
    }

    public void enterPostalCode(String code) {
        postalCodeInput.sendKeys(code);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public boolean isOverviewDisplayed() {
        return overviewTitle.isDisplayed();
    }

    public void finishOrder() {
        finishButton.click();
    }

    public boolean isOrderComplete() {
        return completeHeader.isDisplayed();
    }
}