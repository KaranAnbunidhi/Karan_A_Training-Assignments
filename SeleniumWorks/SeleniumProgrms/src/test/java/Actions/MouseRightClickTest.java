package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseRightClickTest {
	@Test
	public void rightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(rightClick).contextClick().perform();
		
		
	}
}
