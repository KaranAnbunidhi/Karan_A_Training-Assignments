package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NikeScrollTest {
	WebDriver driver;

	@Test
	public void testScrollDown() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/");

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shoes"))).click();

		WebElement productN = driver.findElement(By.xpath("//div[@data-product-position='24']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", productN);

		System.out.println(productN.getText());

		productN.click();

	}

}
