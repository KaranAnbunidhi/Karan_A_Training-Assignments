package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenShotTimeStamp {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		// to handle/off the pop ups in chrome browser
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test
	public void Login() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauc");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("title")));
		} catch (TimeoutException te) {
			System.out.println("Taking Screenshot for Login Failure");
			
			
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd_HHmmss");
			String timeStamp=sdf.format(date);
			
//			Anonymous Object-handled by JVM
//			String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			
			// Step 1: Convert WebDriver object to TakesScreenshot
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Step 2: Capture screenshot and store it as a file
			File src = ts.getScreenshotAs(OutputType.FILE);

			// Step 3: Create destination file
			File dest = new File("screenshots/"+timeStamp+"_LoginFailure");

			// Step 4: Copy file from source to destination
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String expResult = "Products";
		String actResult = driver.findElement(By.className("title")).getText();

		Assert.assertEquals(actResult, expResult);
	}

	@AfterClass
	public void afterClass() {
	}

}
