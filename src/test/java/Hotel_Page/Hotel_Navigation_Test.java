package hotel_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Hotel_Navigation_Test {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://phptravels.net/");
    }

    @Test
    public void verifyHotelNavigationLink() {
        WebElement hotelLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Hotels')]"))
        );
        hotelLink.click();

    }
}
