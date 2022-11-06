//package learn;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TemplateTest {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeTest
//    public void setupTest() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterTest
//    public void teardown() {
//        driver.close();
//        driver.quit();
//    }
//
//    @Test
//    public void initTest() {
//
//    }
//}
