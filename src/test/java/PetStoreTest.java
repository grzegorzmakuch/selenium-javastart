import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.time.Duration;

public class PetStoreTest {
    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
    }

    @Test
    public void firstLoginTest() {
        driver.findElement(By.cssSelector("#Content a")).click();
        driver.findElement(By.cssSelector("#MenuContent a[href*='signonForm']")).click();
        driver.findElement(By.name("username")).sendKeys("NotExistingLogin");
        driver.findElement(By.name("password")).sendKeys("NotProperPassword");
        driver.findElement(By.name("signon")).click();
        assertEquals(driver.findElement(By.cssSelector("#Content .messages")).getText(), "Invalid username or password. Signon failed.");
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
