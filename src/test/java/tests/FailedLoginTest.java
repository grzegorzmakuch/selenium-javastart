package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase {

    @Test
    public void asUserTryToLoginWithIncorrectNameAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("notExistingLogin")
                .typeIntoPasswordField("notExistingPassword")
                .clickOnLoginButton();

        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
