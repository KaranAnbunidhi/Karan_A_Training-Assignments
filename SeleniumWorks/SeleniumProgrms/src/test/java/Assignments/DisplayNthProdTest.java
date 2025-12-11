package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DisplayNthProdTest {
  @Test
  public void NthProduct() throws InterruptedException {
	  Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBar=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Product Name: ");
		String prodName=sc.nextLine();
		
		searchBar.sendKeys(prodName);
		
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button")).click();
		
	    int n=sc.nextInt();
	    System.out.println(driver.findElement(By.xpath("(//div[@class='RG5Slk'])[" + n + "]")).getText());

	    driver.quit();
		
	
  }
}
