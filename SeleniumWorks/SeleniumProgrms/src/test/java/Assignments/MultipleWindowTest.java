package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleWindowTest {
	@Test
	public void switchWindow() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("openwindow"))).sendKeys(Keys.ENTER);
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();

		for (String eachWindow : allwindows) {
			if (!eachWindow.equals(parentWindow))
				driver.switchTo().window(eachWindow);
		}
		System.out.println("Switched to New Window");
		driver.switchTo().window(parentWindow);
		System.out.println("Switched to Parent Window");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#opentab"))).sendKeys(Keys.ENTER);
		System.out.println("Switched to New Tab");
	}
}
