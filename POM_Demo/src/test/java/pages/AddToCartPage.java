package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class AddToCartPage {

    WebDriver driver;
    WebDriverWait wait;

    public AddToCartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickAddToCart() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.addToCart))
                .click();
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
