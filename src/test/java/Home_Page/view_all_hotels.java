package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class view_all_hotels {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void viewAllHotel() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement viewMore = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/section/div/div/div[2]/div[2]/div/div/a/div/span"))
        );

        // Scroll into view to avoid overlay issues
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewMore);
        Thread.sleep(500); // small pause for animation

        // Try normal click first
        try {
            viewMore.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            // If still blocked, use JS click
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", viewMore);
        }
    }


}
