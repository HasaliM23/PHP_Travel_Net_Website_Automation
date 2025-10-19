package Tour_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PriceSortByTest {

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
    public void filterPriceSort() throws InterruptedException {

        //Click Highest to lowest

        WebElement clickHighestToLowest = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='desc']")));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickHighestToLowest);
        Thread.sleep(2000);

        // Click using JavaScript to avoid interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickHighestToLowest);

        Thread.sleep(2000);

        //Click  lowest to Highest

        WebElement clickLowestToHighest = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='asc']"))
        );

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickLowestToHighest);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickLowestToHighest);



    }
}
