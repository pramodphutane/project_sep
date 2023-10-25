package Utility;

import base.LaunchURL;
import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
public class TakeScreenshot {
    private WebDriver driver;

    public TakeScreenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void takePageScreenshot(String filename){
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("tmp\\"+filename+".png"));
        } catch (
                IOException e) {
            System.out.print("Error while taking screenshot: " + e);
        }
    }

}
