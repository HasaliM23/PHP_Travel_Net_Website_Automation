package Tour_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ViewMoreTours {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod

    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tours/9404/dubai/09-10-2025/2/0/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void viewMoreDubaiStunning() throws InterruptedException {

        // Click first "View More"
        WebElement viewMore1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/tour/26/tours/09-10-2025/2/0']")
        ));
        viewMore1.click();

        Thread.sleep(2000);
        // Switch to the new tab
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Wait for new page to load (optional)
        Thread.sleep(3000);

        // Close the new tab
        driver.close();

        // Switch back to the original
        driver.switchTo().window(originalWindow);

        // Click second "View More"
        WebElement viewMore2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/tour/36/tours/09-10-2025/2/0']")
        ));
        viewMore2.click();

        Thread.sleep(2000);





    }

    @Test
    public void viewMoreSpectacularsOfDubai() throws InterruptedException{

        // Click second "View More"
        WebElement viewMore2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/tour/36/tours/09-10-2025/2/0']")
        ));
        Thread.sleep(2000);
        viewMore2.click();


    }

    @Test
    public void viewMoreDubaitheDesertDubaiCombo() throws InterruptedException{

        // Click second "View More"
        WebElement viewMore3 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/tour/24/tours/09-10-2025/2/0']")
        ));
        viewMore3.click();


    }



}
