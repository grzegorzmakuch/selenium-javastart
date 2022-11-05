package page.objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    Logger logger = LogManager.getRootLogger();
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
        logger.info("Typed into User Name field {}", userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password field {}", password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();
        logger.info("Clicked on Login button");
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message: {}", warningText);
        return warningText;
    }

    public void clickOnFishElement() {
        fishLink.click();
    }
}
