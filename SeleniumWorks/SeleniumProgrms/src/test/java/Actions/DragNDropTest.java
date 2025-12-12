package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragNDropTest {
	@Test
	public void performDragNDrop() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");

		// elements
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		// ⭐ get BEFORE color
		String beforeColor = Color.fromString(targetEle.getCssValue("background-color")).asHex();
		System.out.println("Before Drop Color: " + beforeColor);

		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 400).perform();

		// drag & drop
		actions.dragAndDrop(sourceEle, targetEle).perform();

		// ⭐ get AFTER color
		String afterColor = Color.fromString(targetEle.getCssValue("background-color")).asHex();
		System.out.println("After Drop Color: " + afterColor);

		Assert.assertNotEquals(afterColor, beforeColor, "Background color should change after dropping!");
	
	}
}
