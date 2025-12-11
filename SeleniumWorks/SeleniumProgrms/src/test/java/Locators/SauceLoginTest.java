package Locators;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceLoginTest {
  @Test
  public void LoginTest() {
	//to handle/off the pop ups in chrome browser
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_leak_detection", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);

			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");

			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("secret_sauce");
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();

			String expResult = "Products";
			String actResult = driver.findElement(By.className("title")).getText();
			
			Assert.assertEquals(actResult, expResult);
  }
}
