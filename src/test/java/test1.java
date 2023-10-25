import Utility.TakeScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import base.LaunchURL;
import page_objects.HomePage;

/**
 * Created test
 */
public class test1 {
   WebDriver driver = new ChromeDriver();
    LaunchURL launchUrl = new LaunchURL(driver);
    TakeScreenshot takescreenshot = new TakeScreenshot(driver);
    HomePage homePage = new HomePage(driver);

    @Test
    public void test() throws InterruptedException {

        launchUrl.getUrl();
        homePage.clickOnResourcesTab();
        takescreenshot.takePageScreenshot("resourceTab");

    }

//    @BeforeTest
//    public void beforeTest() {
//        driver = new ChromeDriver();
//    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
