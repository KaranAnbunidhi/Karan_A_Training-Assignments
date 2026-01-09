package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class OverviewPage {

    WebDriver driver;
    WebDriverWait wait;

    public OverviewPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickFinish() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Locators.confirmOrder))
                .click();
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
