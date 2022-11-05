package tests;

import org.testng.annotations.Test;
import page.objects.*;
import static org.testng.Assert.*;

public class FailedFishCheckout extends TestBase{

    @Test
    public void tryToCheckoutElementWithoutLogin() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishElement();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickOnAngelfishLink();

        AngelfishListPage angelfishListPage = new AngelfishListPage();
        angelfishListPage.clickAddToCartButton();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickOnProceedToCheckoutButton();

        String warningMessageTemplate = "You must sign on before attempting to check out. Please sign on and try checking out again.";
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, warningMessageTemplate);
    }
}
