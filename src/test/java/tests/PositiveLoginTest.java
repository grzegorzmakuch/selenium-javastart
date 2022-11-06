package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();

        boolean isBannerAfterLoginDisplayed = loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }
}
