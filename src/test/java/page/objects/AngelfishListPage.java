package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelfishListPage {
    @FindBy(css = "#Catalog tr:nth-child(2) td:last-child a.Button")
    private WebElement addToCartFirstElementButton;

    public AngelfishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickAddToCartButton() {
        addToCartFirstElementButton.click();
    }
}
