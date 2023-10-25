import Utility.TakeScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import base.LaunchURL;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
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
        homePage.clickOnCompanyTab();
        takescreenshot.takePageScreenshot("CompanyTab");

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
