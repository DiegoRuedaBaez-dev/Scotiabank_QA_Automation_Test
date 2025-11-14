package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class filteringPage {

    private WebDriver driver;

    @FindBy(css = "select.product_sort_container")
    private WebElement filterDropdown;

    @FindBy(css = ".inventory_item_name")
    private List<WebElement> productNames;

    @FindBy(css = ".inventory_item_price")
    private List<WebElement> productPrices;

    public filteringPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // --- Actions ---
    public void selectFilterOption(String option) {
        Select select = new Select(filterDropdown);
        select.selectByVisibleText(option);
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        for (WebElement item : productNames) {
            names.add(item.getText());
        }
        return names;
    }

    public List<Double> getProductPrices() {
        List<Double> prices = new ArrayList<>();
        for (WebElement price : productPrices) {
            String value = price.getText().replace("$", "").trim();
            prices.add(Double.parseDouble(value));
        }
        return prices;
    }
}
