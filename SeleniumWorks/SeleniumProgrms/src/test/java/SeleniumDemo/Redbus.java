package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String expResult = "Bus Booking Online and Train Tickets at Lowest Price - redBus";

		String actResult = driver.getTitle();

		if (actResult.equals(expResult))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");

		driver.close();

	}

}
