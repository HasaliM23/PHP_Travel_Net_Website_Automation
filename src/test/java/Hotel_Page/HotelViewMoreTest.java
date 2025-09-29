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

public class HotelViewMoreTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://phptravels.net/hotels/dubai/28-09-2025/29-09-2025/1/2/0/LK");
    }

    @Test
    public void verifyHotelCardViewMoreButton() throws InterruptedException {

        WebElement MovenpickviewMoreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://phptravels.net/hotel/2/movenpick-grand-al-bustan/28-09-2025/29-09-2025/1/2/0/LK/hotels']")));
        MovenpickviewMoreButton.click();

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        WebElement FourPointsviewMoreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://phptravels.net/hotel/3/four-points-by-sheraton-bur-dubai/28-09-2025/29-09-2025/1/2/0/LK/hotels']")));
        FourPointsviewMoreButton.click();

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        // Click "View More" for voco Dubai
        WebElement vocoDubaiViewMore = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@id='fadein']/main/section/div[2]/div/div[2]/div/ul/li[3]/div/div/div/div[2]/div/div[2]/div[2]/a")));

        // Scroll to center
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", vocoDubaiViewMore);

        // Ensure clickable, then click via JS (to avoid interception)
        wait.until(ExpectedConditions.elementToBeClickable(vocoDubaiViewMore));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", vocoDubaiViewMore);

        // Click "View More" Grand Mercure

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        WebElement GrandMercureViewMore = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@id='fadein']/main/section/div[2]/div/div[2]/div/ul/li[4]/div/div/div/div[2]/div/div[2]/div[2]/a")));

        // Scroll to center
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", GrandMercureViewMore);

        // Ensure clickable, then click via JS (to avoid interception)
        wait.until(ExpectedConditions.elementToBeClickable(vocoDubaiViewMore));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", GrandMercureViewMore);

            // Click "View More" Amrani Hotel

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        WebElement AmraniHotelViewMore = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//*[@id='fadein']/main/section/div[2]/div/div[2]/div/ul/li[5]/div/div/div/div[2]/div/div[2]/div[2]/a")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", AmraniHotelViewMore);
        wait.until(ExpectedConditions.elementToBeClickable(AmraniHotelViewMore));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AmraniHotelViewMore);



    }
}
