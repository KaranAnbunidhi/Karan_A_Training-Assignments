package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDownTest {
  @Test
  public void handleDropdown() throws InterruptedException {
	  	ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("firstname")).sendKeys("Kumar");
		driver.findElement(By.name("lastname")).sendKeys("S");
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
		Select s1=new Select(driver.findElement(By.id("day")));
		s1.selectByValue("4");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
		Select s2=new Select(driver.findElement(By.id("month")));
		
		s2.selectByIndex(3);
		Thread.sleep(2000);
		s2.selectByValue("7");
		Thread.sleep(2000);
		s2.selectByVisibleText("Oct");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
		Select s3=new Select(driver.findElement(By.id("year")));
		
		s3.selectByValue("2002");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("kumars2002@gmail.com");
		
		

  }
}
