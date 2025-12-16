package ToolTip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
    	
    	WebElement firstName=driver.findElement(By.id("firstname"));
    	
    	String value=firstName.getAttribute("title");
    	System.out.println(value);
       
    }
}
