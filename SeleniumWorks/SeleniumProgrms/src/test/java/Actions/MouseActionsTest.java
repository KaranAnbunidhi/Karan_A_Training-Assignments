package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseActionsTest {
  @Test
  public void mouseHover() {
	  	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement electronicsMenu=driver.findElement(By.xpath("//ul[@class='vl-flyout-nav__container']/li[3]/a"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(electronicsMenu).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Smartphones and accessories")));
		driver.findElement(By.linkText("Smartphones and accessories")).click();
		
		
  }
}
