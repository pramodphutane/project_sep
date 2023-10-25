package page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Element xpath
    private String ResourceTabXpath = "//li/a[text()='Resources']";
    private String CompanyTabXpath = "//li/a[text()='Company']";

    WebDriverWait wait;
    public void clickOnResourcesTab() throws InterruptedException {
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resourseTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ResourceTabXpath)));
      // WebElement resourseTab = driver.findElement(By.xpath(ResourceTabXpath));
        Thread.sleep(3000);
        resourseTab.click();
        Thread.sleep(3000);
    }

    public void clickOnCompanyTab() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement resourseTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CompanyTabXpath)));
        // WebElement resourseTab = driver.findElement(By.xpath(ResourceTabXpath));
        Thread.sleep(3000);
        resourseTab.click();
        Thread.sleep(3000);
    }
}
