package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    }

    @Test(dataProvider = "gadgetsData")
    public void searchAndFetchNthProduct(String searchText, int nthProduct) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 1️⃣ Capture old first product text (if present)
        String oldText = "";
        try {
            oldText = driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]")).getText();
        } catch (Exception e) {
            // ignore first iteration
        }

        // 2️⃣ Locate search box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );

        // 3️⃣ Properly clear search box (Flipkart fix)
        searchBox.sendKeys(Keys.CONTROL, "a");
        searchBox.sendKeys(Keys.DELETE);

        // 4️⃣ Enter new search text
        searchBox.sendKeys(searchText);
        searchBox.sendKeys(Keys.ENTER);

        // 5️⃣ WAIT UNTIL RESULTS CHANGE (MOST IMPORTANT STEP)
        if (!oldText.isEmpty()) {
            wait.until(ExpectedConditions.not(
                    ExpectedConditions.textToBePresentInElementLocated(
                            By.xpath("(//div[@class='RG5Slk'])[1]"),
                            oldText
                    )
            ));
        }

        // 6️⃣ Fetch nth product AFTER results update
        String product = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//div[@class='RG5Slk'])[" + nthProduct + "]")
                )
        ).getText();

        System.out.println(
                "Search: " + searchText +
                " | Nth Product: " + product
        );
    }

    @DataProvider(name = "gadgetsData")
    public Object[][] getGadgetsData() {
        return new Object[][] {
                { "laptops", 2 },
                { "TV", 3 }
        };
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
