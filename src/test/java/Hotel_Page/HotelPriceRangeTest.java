package Hotel_Page;

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

public class HotelPriceRangeTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://phptravels.net/hotels/dubai/28-09-2025/29-09-2025/1/2/0/LK");
    }

    @Test
    public void filterHotelsByPriceRange() throws InterruptedException {
        // Wait for slider container
        WebElement slider = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("rangeFilter")));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);

        // Update range using ionRangeSlider API (simulate dragging)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("$('#rangeFilter input').data('ionRangeSlider').update({ from: 100, to: 500 });");

        // Wait to visually confirm
        Thread.sleep(4000);

        // Print current slider value for verification
        Object value = js.executeScript("return $('#rangeFilter input').val();");
        System.out.println("Current slider value: " + value);
    }
}
