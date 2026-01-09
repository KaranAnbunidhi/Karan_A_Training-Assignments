package pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectrepository.Locators;

public class CustomerInformationPage {

    WebDriver driver;
    WebDriverWait wait;

    public CustomerInformationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void addCustomerDetails() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.firstName))
                .sendKeys("Kumar");

            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastName))
                .sendKeys("S");

            wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.postalCode))
                .sendKeys("603325");

            wait.until(ExpectedConditions.elementToBeClickable(Locators.confirmDetails))
                .click();
        } catch (TimeoutException e) {
            throw e;
        }
    }
}
