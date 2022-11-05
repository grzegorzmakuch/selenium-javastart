package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement userNameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @FindBy(css="#SidebarContent a[href*='FISH']")
    private WebElement fishLink;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoUserNameField(String userName) {
        WaitForElement.waitUntilElementIsVisible(userNameField);
        userNameField.clear();
        userNameField.sendKeys(userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        return warningText;
    }

    public void clickOnFishElement() {
        fishLink.click();
    }
}
