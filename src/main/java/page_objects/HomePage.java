package page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Element xpath
    private String ResourceTabXpath = "//li/a[text()='Resources']";
    public void clickOnResourcesTab() throws InterruptedException {
        WebElement resourseTab = driver.findElement(By.xpath(ResourceTabXpath));
        Thread.sleep(3000);
        resourseTab.click();
        Thread.sleep(3000);
    }
}
