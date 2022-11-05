package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {
    @FindBy(css = "#Catalog tr:nth-child(2) a")
    private WebElement angelfishLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelfishListPage clickOnAngelfishLink() {
        angelfishLink.click();
        return new AngelfishListPage();
    }
}
