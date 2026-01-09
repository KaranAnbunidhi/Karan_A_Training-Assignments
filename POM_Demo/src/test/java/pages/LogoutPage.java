package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class LogoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public LogoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validateLogout() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.options))
                .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.logout))
                .sendKeys(Keys.ENTER);
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
