package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationTest {
  @Test
  public void peformNavigation() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      // Website 1
      driver.navigate().to("https://www.google.com");
      System.out.println("Opened Website 1: Google");
      Thread.sleep(2000);

      // Website 2
      driver.navigate().to("https://www.wikipedia.org");
      System.out.println("Opened Website 2: Wikipedia");
      Thread.sleep(2000);

      // Navigate back to Website 1
      driver.navigate().back();
      System.out.println("Navigated back to Website 1");
      Thread.sleep(2000);

      // Navigate forward to Website 2
      driver.navigate().forward();
      System.out.println("Navigated forward to Website 2");
      Thread.sleep(2000);

      // Again navigate to Website 1
      driver.navigate().to("https://www.google.com");
      System.out.println("Navigated again to Website 1");
      Thread.sleep(2000);

      // Refresh Website 1
      driver.navigate().refresh();
      System.out.println("Refreshed Website 1");
      Thread.sleep(2000);
      
      driver.quit();
  }
}
