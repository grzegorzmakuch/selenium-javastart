//package learn;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.testng.Assert.*;
//
//public class WebElementsTest {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.navigate().to("http://przyklady.javastart.pl/test/full_form.html");
//    }
//
//    @Test
//    public void dropDownTest() {
//        sleep();
//        WebElement countryWebElement = driver.findElement(By.id("country"));
//        Select countryDropDown = new Select(countryWebElement);
//        List<WebElement> options = countryDropDown.getOptions();
//        List<String> namesOfOptions = new ArrayList<>();
//        for(WebElement option : options) {
//            namesOfOptions.add(option.getText());
//            System.out.println(option.getText());
//        }
//
//        List<String> expectedNamesOfOptions = new ArrayList<>();
//        expectedNamesOfOptions.add("Germany");
//        expectedNamesOfOptions.add("Poland");
//        expectedNamesOfOptions.add("UK");
//
//        Assert.assertEquals(namesOfOptions, expectedNamesOfOptions);
//    }
//
//    @Test
//    public void selectingOptionsFromDropDownTest() {
//        WebElement countryWebElement = driver.findElement(By.id("country"));
//        Select countryDropDown = new Select(countryWebElement);
//        sleep();
//        countryDropDown.selectByIndex(1);
//        sleep();
//        Assert.assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Poland");
//
//        countryDropDown.selectByValue("de_DE");
//        sleep();
//        Assert.assertEquals(countryDropDown.getFirstSelectedOption().getText(), "Germany");
//
//        countryDropDown.selectByVisibleText("UK");
//        sleep();
//        Assert.assertEquals(countryDropDown.getFirstSelectedOption().getText(), "UK");
//    }
//
//    @Test
//    public void checkIfElementsOnPageTest() {
//        WebElement usernameWebElement = driver.findElement(By.id("username"));
//        WebElement passwordWebElement = driver.findElement(By.id("password"));
//        WebElement emailLabelWebElement = driver.findElement(By.cssSelector("span[class='help-block']"));
//
//        System.out.println("Is the username displayed: " + usernameWebElement.isDisplayed());
//        System.out.println("Is the username enabled: " + usernameWebElement.isEnabled());
//        System.out.println("Is the password displayed: " + passwordWebElement.isDisplayed());
//        System.out.println("Is the password enabled: " + passwordWebElement.isEnabled());
//        System.out.println("Is the email label displayed: " + emailLabelWebElement.isDisplayed());
//        System.out.println("Is the email label enabled: " + emailLabelWebElement.isEnabled());
//
//        assertTrue(usernameWebElement.isDisplayed());
//        assertTrue(passwordWebElement.isDisplayed());
//        assertTrue(emailLabelWebElement.isDisplayed());
//
//        assertTrue(usernameWebElement.isEnabled());
//        assertFalse(passwordWebElement.isEnabled());
//    }
//
//    @Test
//    public void hoverOverAndClickAndHoldTest() {
//        driver.navigate().to("http://przyklady.javastart.pl/test/hover_mouse.html");
//        WebElement smileyOneWebElement = driver.findElement(By.id("smiley"));
//        WebElement smileyTwoWebElement = driver.findElement(By.id("smiley2"));
//        Actions action = new Actions(driver);
////        action.moveToElement(smileyOneWebElement).moveToElement(smileyTwoWebElement);
//        action.moveToElement(smileyOneWebElement).build().perform();
//        sleep();
//        action.moveToElement(smileyTwoWebElement).build().perform();
//        sleep();
//    }
//
//    @Test
//    public void tempCheckTest() {
//        WebElement username = driver.findElement(By.id("username"));
//        username.sendKeys("Grzegorz");
//        String userNameValue = username.getAttribute("value");
//        System.out.println(userNameValue);
//        assertEquals(userNameValue, "Grzegorz");
//    }
//
//    private void sleep() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @AfterMethod
//    public void teardown() {
//        driver.close();
//        driver.quit();
//    }
//}
