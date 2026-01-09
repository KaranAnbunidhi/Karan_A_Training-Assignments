package tests;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.CheckoutPage;
import pages.CustomerInformationPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.OverviewPage;
import pages.SelectProductPage;
import utils.Base;
import utils.ReporterBase64;

public class PlaceOrderTest extends Base {

    private static final Logger logger =
            Logger.getLogger(PlaceOrderTest.class);

    LoginPage loginPage;
    SelectProductPage selectProductPage;
    CheckoutPage checkoutPage;
    CustomerInformationPage customerInformationPage;
    OverviewPage overviewPage;
    LogoutPage logoutPage;

    ExtentTest test;

    List<String> steps = Arrays.asList(
            "Login",
            "Product Page",
            "Add To Cart",
            "Checkout",
            "Customer Information",
            "Finish Order",
            "Logout"
    );

    int currentStep;

    @BeforeClass
    public void beforeClass() {

        launchBrowser();

        loginPage = new LoginPage(driver, wait);
        selectProductPage = new SelectProductPage(driver, wait);
        checkoutPage = new CheckoutPage(driver, wait);
        customerInformationPage = new CustomerInformationPage(driver, wait);
        overviewPage = new OverviewPage(driver, wait);
        logoutPage = new LogoutPage(driver, wait);
    }

    private void logStep(String message) {
        test.log(Status.PASS, message);
        logger.info(message);
        currentStep++;
    }

    @Test(
    	    dataProvider = "loginData",
    	    dataProviderClass = utils.TestDataProvider.class
    	)
    public void testPlaceOrder(String username, String password) {
    	currentStep=0;
    	test = extentReports.createTest("Place Order Test - " + username);

        try {
        	
        	loginPage.validateLogin(username, password);
            logStep("Login successful for user: " + username);

            selectProductPage.selectProduct();
            logStep("Product Page opened successfully");

            selectProductPage.clickCartIcon();
            logStep("Add to Cart button is working");

            checkoutPage.clickCheckout();
            logStep("Cart page is shown");

            customerInformationPage.addCustomerDetails();
            logStep("Information page is Processed");

            overviewPage.clickFinish();
            logStep("Overview Page is Shown");

            logoutPage.validateLogout();
            logStep("Logout page is shown");

        } catch (Exception e) {

            ReporterBase64.generateReport(
                    driver,
                    test,
                    Status.FAIL,
                    steps.get(currentStep) + " Failed for user: "+ username
            );

            for (int i = currentStep; i < steps.size(); i++) {
                test.log(Status.SKIP, steps.get(i) + " skipped");
            }

            logger.error("Test failed at step: " + steps.get(currentStep)+ " for user: "+ username, e);
            throw e;
        }
    }

    @AfterClass
    public void afterClass() {
        extentReports.flush();
        
    }
}
//// Simple non optimized code
//package tests;
//
//import org.apache.log4j.Logger;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//
//import pages.CheckoutPage;
//import pages.CustomerInformationPage;
//import pages.LoginPage;
//import pages.LogoutPage;
//import pages.OverviewPage;
//import pages.SelectProductPage;
//import utils.Base;
//import utils.ReporterBase64;
//
//public class PlaceOrderTest extends Base {
//
//    private static final Logger logger =
//            Logger.getLogger(PlaceOrderTest.class);
//
//    LoginPage loginPage;
//    SelectProductPage selectProductPage;
//    CheckoutPage checkoutPage;
//    CustomerInformationPage customerInformationPage;
//    OverviewPage overviewPage;
//    LogoutPage logoutPage;
//
//    ExtentTest test;
//
//    @BeforeClass
//    public void beforeClass() {
//
//        launchBrowser();
//        test = extentReports.createTest("Place Order Test");
//
//        loginPage = new LoginPage(driver, wait);
//        selectProductPage = new SelectProductPage(driver, wait);
//        checkoutPage = new CheckoutPage(driver, wait);
//        customerInformationPage = new CustomerInformationPage(driver, wait);
//        overviewPage = new OverviewPage(driver, wait);
//        logoutPage = new LogoutPage(driver, wait);
//    }
//
//    public void logStep(String message) {
//        test.log(Status.PASS, message);
//        logger.info(message);
//    }
//
//    @Test
//    public void testPlaceOrder() {
//
//        boolean loginDone = false;
//        boolean productDone = false;
//        boolean cartDone = false;
//        boolean checkoutDone = false;
//        boolean infoDone = false;
//        boolean finishDone = false;
//        boolean logoutDone = false;
//
//        try {
//
//            loginPage.validateLogin();
//            loginDone = true;
//            logStep("Login successful");
//
//            selectProductPage.selectProduct();
//            productDone = true;
//            logStep("Product Page opened successfully");
//
//            selectProductPage.clickCartIcon();
//            cartDone = true;
//            logStep("Add to Cart button is working");
//
//            checkoutPage.clickCheckout();
//            checkoutDone = true;
//            logStep("Cart page is shown");
//
//            customerInformationPage.addCustomerDetails();
//            infoDone = true;
//            logStep("Information page is Processed");
//
//            overviewPage.clickFinish();
//            finishDone = true;
//            logStep("Overview Page is Shown");
//
//            logoutPage.validateLogout();
//            logoutDone = true;
//            logStep("Logout page is shown");
//
//            logStep("Logout Operation is Done");
//
//        } catch (Exception e) {
//
//            ReporterBase64.generateReport(
//                    driver,
//                    test,
//                    Status.FAIL,
//                    "Step Failed"
//            );
//
//            if (!loginDone)
//                test.log(Status.SKIP, "Login skipped");
//            if (!productDone)
//                test.log(Status.SKIP, "Product Page skipped");
//            if (!cartDone)
//                test.log(Status.SKIP, "Add to Cart skipped");
//            if (!checkoutDone)
//                test.log(Status.SKIP, "Checkout skipped");
//            if (!infoDone)
//                test.log(Status.SKIP, "Customer Information skipped");
//            if (!finishDone)
//                test.log(Status.SKIP, "Finish Order skipped");
//            if (!logoutDone)
//                test.log(Status.SKIP, "Logout skipped");
//
//            logger.error("Test failed", e);
//            throw e;
//        }
//    }
//
//    @AfterClass
//    public void afterClass() {
//        extentReports.flush();
//        driver.quit();
//    }
