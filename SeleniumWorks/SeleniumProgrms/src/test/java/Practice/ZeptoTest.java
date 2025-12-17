package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ZeptoTest {

	WebDriver driver;

	@Test
	public void productsCheckout() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zepto.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️⃣ Click location button
		wait.until(ExpectedConditions.elementToBeClickable(By.className("WCHS8"))).click();

		// 2️⃣ Enter address
		WebElement addressInput = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search a new address']")));
		addressInput.sendKeys("Poonamallee");

		
		// 3️⃣ Select first suggestion
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@data-testid='address-search-item'])[1]")))
				.click();
		
		
		WebElement searchBar = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@aria-label='Search for products']")));
		searchBar.click();
		WebElement icon = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='paan-corner-banner']")));
		// Step 2: Type into the actual input box
		WebElement searchInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		searchInput.sendKeys("maggie");
		searchInput.sendKeys(Keys.ENTER);

	}
}
