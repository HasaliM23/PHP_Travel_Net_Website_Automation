package Hotel_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HotelSearchByNameTest {

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
    public void searchHotelByName() throws InterruptedException {

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search hotel name...']")));
        searchBox.click();
        searchBox.sendKeys("Movenpick Grand");
        searchBox.sendKeys(Keys.ENTER);



    }

}
