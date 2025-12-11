package Assignments;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonCheckBoxes {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_leak_detection", false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
		radioButton.click();
		
		WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		checkBox1.click();
		
		WebElement checkBox2=driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
		checkBox2.click();

	}

}
