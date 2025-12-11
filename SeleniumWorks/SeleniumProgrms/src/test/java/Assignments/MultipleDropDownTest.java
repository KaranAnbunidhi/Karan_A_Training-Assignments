package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MultipleDropDownTest {

    @Test
    public void performMultipleDropDown() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        driver.get("https://demo.mobiscroll.com/select/multiple-select");

        // Scroll slightly down to avoid click interception by search bar
        actions.scrollByAmount(0, 200).perform();

        // Open dropdown
        WebElement dropdown = wait.until(
        		ExpectedConditions.presenceOfElementLocated(By.id("multiple-select-input"))
        );
        dropdown.sendKeys(Keys.ENTER);

        // Select values
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Books']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Movies, Music & Games']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Electronics & Computers']"))).click();

        // Click OK using enter key. click operation not working in this website
        dropdown.sendKeys(Keys.ENTER);

        System.out.println("Multiple values selected successfully!");

//        driver.quit();
    }
}
