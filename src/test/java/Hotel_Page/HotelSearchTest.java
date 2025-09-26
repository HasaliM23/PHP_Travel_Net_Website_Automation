package Hotel_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HotelSearchTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://phptravels.net/hotels");
    }

    @Test
    public void verifyHotelSearch() throws InterruptedException {

        WebElement searchBoxClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='combobox']")));
        searchBoxClick.click();

        Thread.sleep(2000);

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-autocomplete='list']")));
        searchBox.click();
        searchBox.sendKeys("Dubai");
        Thread.sleep(2000);

        searchBox.sendKeys(Keys.ENTER);

        //Select check-in date
        WebElement checkIn = driver.findElement(By.xpath("//input[@id='checkin']"));
        checkIn.click();
        checkIn.clear();
        checkIn.sendKeys("30-09-2025");


        // Select check-out date

        WebElement checkOut = driver.findElement(By.xpath("//input[@id='checkout']"));
        checkIn.click();
        checkIn.clear();
        checkIn.sendKeys("01-10-2025");

        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        search.click();




    }
}
