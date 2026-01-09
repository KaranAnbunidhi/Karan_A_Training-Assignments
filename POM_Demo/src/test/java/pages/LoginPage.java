package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validateLogin(String username, String password) {

        try {
            // Wait for username field and enter value
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.userName))
                .sendKeys(username);

            // Wait for password field and enter value
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.password))
                .sendKeys(password);

            // Wait for login button and click
            wait.until(ExpectedConditions.elementToBeClickable(Locators.loginButton))
                .click();

            // Optional: wait until login is successful (title visible)
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyLogin));

        } catch (TimeoutException e) {
            // Let test decide FAIL / SKIP
            throw e;
        }
    }
}
