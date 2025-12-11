package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {
  @Test
  public void PassingInput() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      driver.get("https://www.amazon.in/");
      Thread.sleep(2000);

      WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
      searchBar.sendKeys("mobiles");
      searchBar.sendKeys(Keys.ENTER);

      WebElement filter = driver.findElement(By.cssSelector(".a-dropdown-label"));
      filter.click();
      
      System.out.println("CSS Selector with ID and Class executed successfully.");

      Thread.sleep(3000);
      
      driver.quit();
  }
}
