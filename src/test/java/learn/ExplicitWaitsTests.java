package learn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;
public class ExplicitWaitsTests {
    WebDriver driver;

    @BeforeMethod
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");
    }

    @Test
    public void waitForDisappearingElement() {
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        assertTrue(checkbox.isDisplayed());
        assertFalse(checkbox.isSelected());

        WebElement removeAddButton = driver.findElement(By.cssSelector("[onclick='swapCheckbox()']"));
        removeAddButton.click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkbox));

        removeAddButton.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkbox")));

        assertTrue(checkbox.isDisplayed());
        assertFalse(checkbox.isSelected());
    }

    @Test
    public void waitForPresenceOfTheElement() {

    }

    @AfterTest
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
