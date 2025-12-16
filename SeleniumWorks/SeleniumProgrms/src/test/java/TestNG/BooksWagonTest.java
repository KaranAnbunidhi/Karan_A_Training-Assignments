package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BooksWagonTest {
	WebDriver driver;

	@Test(priority = 1)
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
	}

	@Test(priority = 2)
	public void search() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inputbar")));
		driver.findElement(By.className("inputbar")).sendKeys("java");
		driver.findElement(By.name("btnTopSearch")).sendKeys(Keys.ENTER);
	}

	@Test(priority = 3)
	public void sort() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSort")));

		Select s1 = new Select(driver.findElement(By.id("ddlSort")));
		s1.selectByVisibleText("Price - Low to High");
	}

	@Test(priority = 4)
	public void nThProduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    String oldText = driver
	        .findElement(By.xpath("(//div[@class='title'])[2]/a"))
	        .getText();

	    wait.until(ExpectedConditions.not(
	        ExpectedConditions.textToBePresentInElementLocated(
	            By.xpath("(//div[@class='title'])[2]/a"),
	            oldText
	        )
	    ));

	    String newText = driver
	        .findElement(By.xpath("(//div[@class='title'])[2]/a"))
	        .getText();

	    System.out.println("After Sort: " + newText);
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
