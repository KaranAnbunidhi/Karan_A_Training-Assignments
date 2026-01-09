package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class SelectProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public SelectProductPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectProduct() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.selectProduct))
                .sendKeys(Keys.ENTER);

            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyProduct));
        } catch (TimeoutException e) {
            throw e;
        }
    }

    public void clickCartIcon() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.cartIcon))
                .click();
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
