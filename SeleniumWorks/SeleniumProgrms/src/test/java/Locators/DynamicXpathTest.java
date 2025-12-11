package Locators;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicXpathTest {
  @Test
  public void DynamicTest() {
		//to handle/off the pop ups in chrome browser
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");

		WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		login.click();

  }
}
