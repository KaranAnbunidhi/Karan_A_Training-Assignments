package Assignments;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorLinkPartialLink {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement linkText=driver.findElement(By.linkText("Electronics"));
		linkText.click();
		System.out.println("Clicked Electronics link");
		
		WebElement partialLinkText=driver.findElement(By.partialLinkText("Smart"));
		partialLinkText.click();
		System.out.println("Clicked SmartWatches link");
	}

}
