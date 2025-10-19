package Tour_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ApplyFilterFunctionTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://phptravels.net/tours/Dubai/dubai/10-10-2025/1/0/");
    }

    @Test
    public void verifyAppyFilterFunction() throws InterruptedException {

        WebElement fiveStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating5']")));
        fiveStarFilter.click();

        Thread.sleep(2000);

        // Wait for slider container
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PriceRange")));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);
        Thread.sleep(2000);

        // Find left (min) slider handle
        WebElement leftHandle = driver.findElement(By.xpath("//*[@id='rangeFilter']/div/span/span[6]"));

        Actions action = new Actions(driver);

        // Move left handle to the right (increase min price)
        action.clickAndHold(leftHandle).moveByOffset(60, 0).release().perform();
        Thread.sleep(3000);

        //Click  lowest to Highest

        WebElement clickLowestToHighest = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='asc']"))
        );

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickLowestToHighest);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickLowestToHighest);

        // Click Apply Filters
        // Scroll again to ensure Apply Filters button is visible
        WebElement apply = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Apply Filters']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", apply);
        Thread.sleep(1000);


    }

}
