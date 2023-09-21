import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;

import org.apache.commons.io.FileUtils;

import java.io.IOException;

/**
 * Created by celik.gumusdag
 */
public class test1 {

    private WebDriver driver;

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement resourseTab = driver.findElement(By.xpath("//li/a[text()='Resources']"));
        Thread.sleep(3000);
        resourseTab.click();
        Thread.sleep(3000);
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("tmp\\screenshot.png"));
        } catch (IOException e) {
            System.out.print("Error while taking screenshot: " + e);
        }
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
