package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase {

    @Test
    public void asUserTryToLoginWithIncorrectNameAndPassword() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("nonExistingContact");
        loginPage.typeIntoPasswordField("invalidPassword");
        loginPage.clickOnLoginButton();

        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
