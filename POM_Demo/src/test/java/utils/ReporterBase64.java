package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ReporterBase64 {

    public static void generateReport(WebDriver driver,
                                      ExtentTest test,
                                      Status status,
                                      String message) {

        if (status.equals(Status.PASS)) {
            test.log(Status.PASS, message);

        } else if (status.equals(Status.FAIL)) {

            String base64Screenshot =
                    ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.BASE64);

            test.log(Status.FAIL, message,
                    MediaEntityBuilder
                            .createScreenCaptureFromBase64String(base64Screenshot)
                            .build());
        }
    }
}
