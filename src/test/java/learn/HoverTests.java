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
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class HoverTests {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupClass() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.navigate().to("http://theinternet.przyklady.javastart.pl/hovers");
//    }
//
//    @Test
//    public void hoverTest() {
//        WebElement firstAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[1]"));
//        WebElement secondAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[2]"));
//        WebElement thirdAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[3]"));
//
//        Actions action = new Actions(driver);
//        action.moveToElement(firstAvatar).perform();
//
//        WebElement firstCaption = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/h5"));
//        WebElement secondCaption = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/h5"));
//        WebElement thirdCaption = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/div/h5"));
//
//        assertEquals(firstCaption.getText(), "name: user1");
//        assertEquals(secondCaption.getText(), "");
//        assertEquals(thirdCaption.getText(), "");
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
//    @AfterTest
//    public void teardown() {
//        driver.close();
//        driver.quit();
//    }
//
//
//}
