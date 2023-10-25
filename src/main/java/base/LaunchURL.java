package base;
import org.openqa.selenium.*;

public class LaunchURL {
    private WebDriver driver;

    public LaunchURL(WebDriver driver) {
        this.driver = driver;
    }

    String testUrl = "https://www.orangehrm.com/";
    public void getUrl() throws InterruptedException {

        driver.get(testUrl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
}
