package ExtentReports;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Util.ReporterBase64;

public class ExtentReportBase64 {

    WebDriver driver;
    WebDriverWait wait;
    ExtentReports extentReports;
    ExtentTest extentTest;

    @BeforeMethod
    public void setUp() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/ExtentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(spark);

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_leak_detection", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testPlaceOrder() {

        extentTest = extentReports.createTest("Place Order Test");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");
        driver.findElement(By.name("password"))
                .sendKeys("secret_sauce1"); // ❌ wrong password
        driver.findElement(By.id("login-button")).click();

        try {
            wait.until(ExpectedConditions
                    .visibilityOfElementLocated(
                            By.xpath("//span[text()='Products']")));

            ReporterBase64.generateReport(driver, extentTest,
                    Status.PASS, "Login successful");

        } catch (Exception e) {

        	ReporterBase64.generateReport(driver, extentTest,
                    Status.FAIL, "Login failed");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        extentReports.flush();
    }
}
