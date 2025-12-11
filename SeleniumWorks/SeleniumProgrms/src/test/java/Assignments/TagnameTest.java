package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagnameTest {
  @Test
  public void href() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

  
      driver.get("https://zepto.com/");
      Thread.sleep(2000);


      List<WebElement> allLinks = driver.findElements(By.tagName("a"));

      System.out.println("List of all href values:\n");


      for (WebElement link : allLinks) {
          System.out.println(link.getAttribute("href"));
      }

      System.out.println("\nTotal number of anchor tags: " + allLinks.size());

      driver.quit();
  }
}
