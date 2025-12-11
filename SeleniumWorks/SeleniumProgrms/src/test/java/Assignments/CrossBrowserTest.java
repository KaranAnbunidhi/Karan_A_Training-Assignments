package Assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  @Test
  public void LaunchBrowser() throws InterruptedException {
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter browser name (chrome / firefox / edge): ");
      String browser = sc.nextLine();

      WebDriver driver = null;

      // Compare input browser name
      if (browser.equalsIgnoreCase("chrome")) {
          driver = new ChromeDriver();
          System.out.println("Launching Chrome Browser...");
      }
      else if (browser.equalsIgnoreCase("firefox")) {
          driver = new FirefoxDriver();
          System.out.println("Launching Firefox Browser...");
      }
      else if (browser.equalsIgnoreCase("edge")) {
          driver = new EdgeDriver();
          System.out.println("Launching Edge Browser...");
      }
      else {
          System.out.println("Invalid browser name!");
          System.exit(0);
      }

      // Maximize and launch website
      driver.manage().window().maximize();
      driver.get("https://www.wikipedia.org/");

      System.out.println("Website launched successfully!");

      Thread.sleep(2000);
      
      // Close browser
      driver.quit();

      sc.close();
  }
}
