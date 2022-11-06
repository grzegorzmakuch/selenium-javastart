//package learn;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.testng.Assert.*;
//
//public class DropDownTests {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dropdown");
//    }
//
//    @Test
//    public void dropDownTest() {
//        WebElement dropdownWebElement = driver.findElement(By.id("dropdown"));
//        Select dropDownMenu = new Select(dropdownWebElement);
//        String defaultOption = dropDownMenu.getFirstSelectedOption().getText();
//        assertEquals(defaultOption, "Please select an option");
//        dropDownMenu.selectByValue("1");
//        assertTrue(dropDownMenu.getFirstSelectedOption().isSelected());
//        assertEquals(dropDownMenu.getFirstSelectedOption().getText(), "Option 1");
//        dropDownMenu.selectByValue("2");
//        assertTrue(dropDownMenu.getFirstSelectedOption().isSelected());
//        assertEquals(dropDownMenu.getFirstSelectedOption().getText(), "Option 2");
//    }
//
//    @AfterTest
//    public void teardown() {
//        driver.close();
//        driver.quit();
//    }
//
//
//}
