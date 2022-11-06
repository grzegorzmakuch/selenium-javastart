//package learn;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.testng.Assert.*;
//
//public class CheckBoxesTests {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.navigate().to("http://theinternet.przyklady.javastart.pl/checkboxes");
//    }
//
//    @AfterTest
//    public void teardown() {
//        driver.close();
//        driver.quit();
//    }
//
//    @Test
//    public void checkIfCheckboxTwoIsSelected() {
//        List<WebElement> checkboxList = driver.findElements(By.tagName("input"));
//        assertFalse(checkboxList.get(0).isSelected());
//        assertTrue(checkboxList.get(1).isSelected());
//    }
//
//    @Test
//    public void selectFistBoxAndUnselectSecond() {
//        List<WebElement> checkboxList = driver.findElements(By.tagName("input"));
//        WebElement firstBox = checkboxList.get(0);
//        WebElement secondBox = checkboxList.get(1);
//        Actions action = new Actions(driver);
//        action.click(firstBox).click(secondBox).build().perform();
//        assertTrue(firstBox.isSelected());
//        assertFalse(secondBox.isSelected());
//    }
//}
