package WindowHandling;

import java.sql.Driver;
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

public class WindowHandleTest {
	@Test
	public void flipkartSearch() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));

		searchBox.sendKeys(Keys.CONTROL + "a");
		searchBox.sendKeys(Keys.DELETE);
		searchBox.sendKeys("laptops");
		searchBox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[3]")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();

		for (String eachWindow : allwindows) {
			if (!eachWindow.equals(parentWindow))
				driver.switchTo().window(eachWindow);
		}
		String offerText = driver.findElement(By.className("HlFe1v")).getText();
		System.out.println(offerText);
		
		driver.quit();
	}
}
